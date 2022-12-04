import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class MainProgram2 {
    Scanner scanner = new Scanner(System.in);
    MyParagraph myParagraph =null;
    public void menu() {

        int choice;
        do {
            System.out.println("1. Inserting a paragraph from keyboard.");
            System.out.println("2. Reading a paragraph from file. ");
            System.out.println("3. Presenting paragraph's processing results on screen. ");
            System.out.println("4. Writing paragraph's processing results in a file. ");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Write a paragraph:");
                    scanner.nextLine();
                    String st = scanner.nextLine();
                    myParagraph = new MyParagraph(st);
                    break;
                case 2:
                    System.out.print("Give file name: ");
                    String filename = scanner.next();
                    // ελέγχεται εάν υπάρχει και εάν μπορεί να ανοίξει για ανάγνωση το συγκεκριμένο αρχείο.

                    try {
                        File myFile = new File(filename+".txt");
                        Scanner myReader = new Scanner(myFile);

                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            System.out.println(data);
                            myParagraph = new MyParagraph(data);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("File not found error.");
                        e.printStackTrace();

                    }
                    break;
                case 3:
                    if( myParagraph!=null) {
                        myParagraph.sentenceCount();
                        myParagraph.wordsPerSentence();
                        myParagraph.sortedWordsPerSentence();
                        myParagraph.vowelsandConsonantsPerSentence();
                    }else System.out.println("Paragraph is null. Choose 1 or 2.");
                    break;
                case 4:
                    if( myParagraph!=null) {
                        try {
                            File myFile = new File("ParagraphResults.txt");
                            if (myFile.createNewFile()) {
                                System.out.println("File created: " + myFile.getName());
                            } else {
                                System.out.println("File already exists.");
                            }
                            myParagraph.sentenceCountToFile();
                            myParagraph.wordsPerSentenceToFile();
                            myParagraph.sortedWordsPerSentenceToFile();
                            myParagraph.vowelsandConsonantsPerSentenceToFile();
                        } catch (IOException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();

                        }
                    }else System.out.println("Paragraph is null. Choose 1 or 2.");
                    break;
                case 5:
                    break;

            }
        } while (choice != 5);
    }
}

