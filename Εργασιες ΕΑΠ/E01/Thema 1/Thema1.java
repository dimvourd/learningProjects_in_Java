import java.util.Scanner;

public class Thema1 {
    public static void main(String[] args) {
        int counter;
        String target;
        String other;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter target string: ");
        target = keyboard.nextLine();

        System.out.print("Enter other string:(length = " + target.length() + "): ");
        other = keyboard.nextLine();

        //oso to mhkos ton strings einai to diaforetiko vazo to xrhsth na mou 3anadosei to other string
        while (target.length() != other.length()){
            System.out.println("Error in length");
            System.out.print("Enter other string:(length = " + target.length() + "): ");
            other = keyboard.nextLine();
        }

        //metrao tous diaforetikous charakthres metaxy ton strings
        counter = 0;
        for (int i=0; i<target.length(); i++){
            if (target.charAt(i) != other.charAt(i))
                counter+=1;
        }

        //typono ta diaforetika stings kai thn apostash hamming meta3u tous me to counter
        System.out.println("The Hamming distance of "+target+
                " and " +other+ " is "+ counter);

    }
}