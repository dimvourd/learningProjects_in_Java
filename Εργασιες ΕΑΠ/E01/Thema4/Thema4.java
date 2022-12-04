import java.util.Scanner;

public class Thema4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String mystring;
        String forWhile = "";
        //Sygkrino me thn methodo equals ton strings
        while (!forWhile.equals("S")) {     //ean to forWhile DEN(!) einai iso me to "S" synexizo sthn arxh dn einai afou forWhile = "". tha mporousa na to kano k me do while
            System.out.print("Give a string: ");
            mystring = keyboard.nextLine();
            StringUtils objStringUtils = new StringUtils(mystring);
            System.out.println("Hamming distance between your string and the reverse is: " +
                    objStringUtils.reverseDistance()); //ektypono ayto poy epistrefei h reverseDistance

            System.out.println("Type S to Stop, other to repeat: ");
            forWhile = keyboard.nextLine();
        }
    }
}