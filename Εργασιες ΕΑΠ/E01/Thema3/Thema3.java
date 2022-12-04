import java.util.Scanner;

public class Thema3 {

    public static void main(String[] args) {
        String target;
        String[] stringList = new String[5];    //pinakas me strings
        int[] distances = new int[5];           //pinakas me integers

        Scanner kb = new Scanner(System.in);    //object kb ths klashs scanner

        for (int i = 0; i < 5; i++) {
            System.out.print(i+1+". Enter string: ");
            stringList[i] = kb.nextLine();      //o xrhsths grafei to string kai to apo8hkeuo se pinaka
        }

        System.out.print("\nEnter target: ");
        target=kb.nextLine();                   //o xrhsths grafei to target kai to apo8hkeuo se mia metavlhth string

        for(int i=0;i < 5;i++)
            distances[i] = hamming(target, stringList[i]);  //kalo thn hamming gia na sugkrino target me ta periexomena
                                                            //tou pinaka(koitaxte thn methodo parakato)

        //prepei na isxuei to melos i ton distances -> megalutero iso tou 0 KAI
        //prota prepei na isxuei to ena apo ta 2: H to melos i na einai <= min H to min==-1
        int min = distances[0];
        String min_hamming_string = "";
        for(int i=0;i < 5;i++){

            if ((distances[i] >= 0) && ((distances[i] <= min) || (min == -1))){
                min =distances[i];                      //ean h parapano sun8hkh isxuei dhlono min to melos toy pinaka
                min_hamming_string = stringList[i];     //kai apo8hkeuo se mia metavlhth to string gia to opoio isxuei h
                                                        // sun8hkh
            }
        }


        System.out.println("Contents of array distances");  //ektypono tis hamming apostaseis
        for (int i=0; i<5; i++)
            System.out.println(i +" "+ distances[i]);

        //ean to string me thn mikroterh apostash hamming den einai keno shmainei oti eparxei kai to ektypono
        if (!min_hamming_string.equals(""))
            System.out.println("String with min Hamming distance: "+ min_hamming_string);
        else
            System.out.println("No Hamming distance found");
    }


    //methodos poy sungrinei dyo strings. elegxei ean den exoun idio mhkos kai epistrefei -1
    public static int hamming(String target, String other){
        if(target.length() != other.length())
            return -1;
        //ean exoun idio mhkos, elegxei poioi xaraktires einai diaforetikoi kai toys metraei sto counter.
        //sto telos to epistrefei
        else{
            int counter=0;
            for (int i=0; i<target.length(); i++){
                if (target.charAt(i) != other.charAt(i))
                    counter+=1;
            }
            return counter;
        }
    }
}
