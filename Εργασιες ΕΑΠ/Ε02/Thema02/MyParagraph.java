import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.Character.toUpperCase;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
public class MyParagraph {
    private String parag;

    private String[] sentences;
    private String[][] words;
    private int sentences_count;


    /**
     * Κατασκευαστής δέχεται ως όρισμα ένα αλφαριθμητικό.
     * Το αλφαριθμητικό θα είναι το κείμενο μιας παραγράφου που για λόγους απλότητας δεχόμαστε
     * ότι θα αποτελείται από λέξεις χωρισμένες με κενά, ότι οι προτάσεις της παραγράφου χωρίζονται
     * μεταξύ τους αποκλειστικά και μόνο από τελείες και ότι μετά από κάθε τελεία δεν ακολουθεί κενό
     * αλλά το πρώτο γράμμα της επόμενης πρότασης (δε χρειάζεται να ελέγχετε κάτι).
     * Ο κατασκευαστής αρχικά θα αποθηκεύει τις προτάσεις της παραγράφου στον πίνακα sentences
     * (για τον διαχωρισμό των προτάσεων μπορείτε να χρησιμοποιήσετε τη μέθοδο split() της κλάσης String).
     * Στη συνέχεια θα διαχωρίζει τις λέξεις κάθε πρότασης και θα τις αποθηκεύει στον πίνακα words.
     */
    MyParagraph(String parag) {
        this.parag = parag;
        this.sentences = parag.split("[.]"); // Ο κατασκευαστής αρχικά θα αποθηκεύει τις προτάσεις της παραγράφου στον πίνακα sentences
        this.words = new String[sentences.length][];

        for (int i = 0; i < sentences.length; i++) {
            words[i] = sentences[i].split(" "); // Στη συνέχεια θα διαχωρίζει τις λέξεις κάθε πρότασης και θα τις αποθηκεύει στον πίνακα words.
        }
    }
    /**Μια δημόσια μέθοδο με όνομα wordsPerSentence η οποία
     * θα υπολογίζει και θα εμφανίζει στην οθόνη το πλήθος των λέξεων κάθε πρότασης
     * ενός αντικειμένου MyParagraph.
     */
    public void wordsPerSentence(){

        for (int i =0;i< sentences.length;i++){
            System.out.println("Sentence No:"+(i+1)+" has "+sentences[i].split(" ").length+ " words.");
            // sentences[i].split(" ").length : με αυτή την εντολή φτιάχνω νέο πίνακα και μετράω τα περιεχόμενα του.
        }
        System.out.println();
    }
    public void wordsPerSentenceToFile(){
        try {
            FileWriter myWriter = new FileWriter("ParagraphResults.txt",true);
            for (int i =0;i< sentences.length;i++){
                myWriter.write("Sentence No:"+(i+1)+" has "+sentences[i].split(" ").length+ " words.\n");
                // sentences[i].split(" ").length : με αυτή την εντολή φτιάχνω νέο πίνακα και μετράω τα περιεχόμενα του.
            }
            myWriter.write("\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    /*Μια δημόσια μέθοδο με όνομα sentenceCount η οποία
      θα εμφανίζει στην οθόνη το πλήθος των προτάσεων ενός αντικειμένου MyParagraph.
     */
    public void sentenceCount(){
        sentences_count = this.sentences.length;
        System.out.println("The number of sentences in the given paragraph is: "+this.sentences_count);
        System.out.println();
    }

    public void sentenceCountToFile(){
        sentences_count = this.sentences.length;
        try {
            FileWriter myWriter = new FileWriter("ParagraphResults.txt");
            myWriter.write("The number of sentences in the given paragraph is: "+this.sentences_count+"\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

    /**Μια δημόσια μέθοδο sortedWordsPerSentence η οποία θα εμφανίζει ταξινομημένες
     *  λεξικογραφικά στην οθόνη τις λέξεις κάθε πρότασης ενός αντικειμένου MyParagraph,
     *  χωρίς να αλλάζει την αρχική σειρά των προτάσεων του αντικειμένου.
     */
    public void sortedWordsPerSentence(){
        System.out.println("Paragraph with sorted words per sentence: ");

        for (String sen: sentences){
            String[] array = sen.split(" "); // φτιάχνω πίνακα με τις λέξεις για να τις ταξινομήσω

            Arrays.sort(array); // ταξινομώ τις λέξεις
            for (var a : array) System.out.print(a+" "); // τις εμφανίζω για κάθε πρόταση
            System.out.println();

        }
        System.out.println();
    }
    public void sortedWordsPerSentenceToFile(){
        try {
            FileWriter myWriter = new FileWriter("ParagraphResults.txt",true);
            myWriter.write("Paragraph with sorted words per sentence: \n");
            for (String sen: sentences){
                String[] array = sen.split(" "); // φτιάχνω πίνακα με τις λέξεις για να τις ταξινομήσω

                Arrays.sort(array); // ταξινομώ τις λέξεις
                for (var a : array) myWriter.write(a+" "); // τις εμφανίζω για κάθε πρόταση
                myWriter.write("\n");
            }
            myWriter.write("\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



    }

    /**Μια δημόσια μέθοδο vowelsandConsonantsPerSentence η οποία θα υπολογίζει το πλήθος των φωνηέντων και των συμφώνων
     * κάθε πρότασης ενός αντικειμένου MyParagraph και θα εμφανίζει τα αποτελέσματα στην οθόνη.
     */
    public void vowelsandConsonantsPerSentence(){
        for (int i =0;i< sentences.length;i++){
            char c;
            int countVowels = 0;
            int countConsonants = 0;
            for( int k = 0; k< sentences[i].length() ; k++ ){

                c = toUpperCase(sentences[i].charAt(k)); // κάνω κεφαλαίο το γράμμα στην θέση k στην πρόταση i
                if(c =='A'|| c == 'E' || c == 'I' || c=='O'|| c == 'U'){ // ελέγχω εαν είναι κάποιο φωνήεν
                    countVowels++;
                }else if (c == 'B'|| c == 'C'|| c== 'D'||c=='F'||c=='G'||c=='J'||c=='K'||c=='L'||c=='M'||c=='N'||
                        c=='P'||c=='Q'||c=='S'||c=='T'||c=='V'||c=='X'||c=='Z'||c=='H'||c=='R'||c=='W'||c=='Y'){
                    // ελέγχο εάν είναι κάποιο σύμφωνο
                    countConsonants++;

                } // σε περίπτωση που είναι τελεία, κόμμα, θαυμαστικό αριθμός ή κάτι άλλο το αγνοώ.
            }
            System.out.println("Number of Vowels in sentence No:"+(i+1)+" is "+countVowels);
            System.out.println("Number of Consonants in sentence No:"+(i+1)+" is "+countConsonants);
        }
    }
    public void vowelsandConsonantsPerSentenceToFile(){
        for (int i =0;i< sentences.length;i++){
            char c;
            int countVowels = 0;
            int countConsonants = 0;
            for( int k = 0; k< sentences[i].length() ; k++ ){

                c = toUpperCase(sentences[i].charAt(k)); // κάνω κεφαλαίο το γράμμα στην θέση k στην πρόταση i
                if(c =='A'|| c == 'E' || c == 'I' || c=='O'|| c == 'U'){ // ελέγχω εαν είναι κάποιο φωνήεν
                    countVowels++;
                }else if (c == 'B'|| c == 'C'|| c== 'D'||c=='F'||c=='G'||c=='J'||c=='K'||c=='L'||c=='M'||c=='N'||
                        c=='P'||c=='Q'||c=='S'||c=='T'||c=='V'||c=='X'||c=='Z'||c=='H'||c=='R'||c=='W'||c=='Y'){
                    // ελέγχο εάν είναι κάποιο σύμφωνο
                    countConsonants++;

                } // σε περίπτωση που είναι τελεία, κόμμα, θαυμαστικό αριθμός ή κάτι άλλο το αγνοώ.
            }
            try {
                FileWriter myWriter = new FileWriter("ParagraphResults.txt",true);
                myWriter.write("Number of Vowels in sentence No:"+(i+1)+" is "+countVowels+"\n");
                myWriter.write("Number of Consonants in sentence No:"+(i+1)+" is "+countConsonants+"\n");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
