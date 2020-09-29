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
        System.out.print("Show non factors? y/n: ");
        String showFac = input.nextLine();

        int mod = -1;
        int otherFactor = -1;
        for (int i = 1; i < (num/2)+1; i++) {
            mod = num % i;
            otherFactor = num/i;
            if (mod == 0) {
                System.out.println(i + " * " + otherFactor);
            } else if (showFac.equals("y")) {
                System.out.println(i + " not");
            }          
        }

        input.close();
    }
}
