/**
 * Prints the factors of a given number
 * @author jackson (leverett.3@osu.edu)
 * @version 20200929
 */
import java.util.Scanner;

public class Factor {
    

    public static void main(String[] args) {

        //set up objects
        Scanner input = new Scanner(System.in);

        //get input
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(input.nextLine());


        for (int i = 1; i < (num/2); i++) {
            if (num % i == 0) {
                System.out.println(i + " factor");
            } else {
                System.out.println(i + " not");
            }          
        }

        input.close();
    }
}
