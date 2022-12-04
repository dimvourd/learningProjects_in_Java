import java.util.Scanner;

class Thema2 {
    public static void main(String[] args) {
        int i, number_St;
        int word_counter=0;
        int upper_counter=0;
        String st;
        Scanner kbd = new Scanner(System.in);
        System.out.println("How many strings?:");                       //rotao ton xrhsh posa strings thelei na grapsei
        number_St = kbd.nextInt();                                      //dinei apanthsh

        kbd.nextLine();                                                 //"katharizei" to kbd gia na dimiourgeite provlhma meta

        //kano epanalhpthka thn diadikasia gia na dosei o xrhsths ta strings pou thelei
        for (i = 1; i <= number_St; i++) {
            System.out.print("Enter string number " + i + ": ");        //zhtao string me ton arithmo i
            st = kbd.nextLine();                                        //dinei string
            if (st.contains(" "))
                System.out.println("Not a world");
            else {
                word_counter += 1;                                      //metrame ayta pou einai apla lexeis
                if (Character.isUpperCase(st.charAt(0)))
                    upper_counter += 1;
            }

        }
        System.out.println("======================================");
        System.out.println("Results");
        System.out.println("Total number of strings: "+ number_St);

        //elegxo na do ean exo strings kai an nai vrisko to pososto ton le3eon se aytes
        if(number_St!=0)
            System.out.println("Percentage of words: "+ 100*((double)word_counter/number_St) );
        else
            System.out.println("We don't have strings");

        //elegxo ean exo le3eis meta3y ton strings kai an nai vrisko to pososto ton le3eon me kefalaio gramma
        if (word_counter!=0)
            System.out.println("Words starting with capital letter:"+100*(upper_counter/(double)word_counter) );
        else
            System.out.println("No words found");
    }
}
