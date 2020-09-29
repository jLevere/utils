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

        //loop through numbers and mod them to check if factor
        int mod = -1;
        int otherFactor = -1;
        int count = 0;
        for (int i = 1; i < (num/2)+1; i++) {

            //do the math
            mod = num % i;
            otherFactor = num/i;

            //print output
            if (mod == 0) {
                System.out.println(i + " * " + otherFactor);
                count++;
            } else if (showFac.equals("y")) {
                System.out.println(i + " not");
            }  
        }

        //give prime warning if only one factor
        if (count == 1) System.out.println("might be prime");

        input.close();
        
    }
}
