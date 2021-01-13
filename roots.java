/**
 * given a number, find its perfect square factors.  Work in progress
 * 
 * @author hi
 * @version 20210112
 */
class roots {

    /**
     * Checks to see if number is a perfect square
     * @param num integer
     * @return  True if square, false if not
     */
    public static boolean checkSquare(int num) {

        double sqr = Math.sqrt(num);

        if (sqr % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * finds the factors of the intputed number and passes them to the checkSquare
     * method. if the factors are square then it prints them
     * 
     * @param num A whole positive number
     */
    static void factor(int num) {

        int mod = -1;
        System.out.println("first * second | sum : dif");
        for (int i = 1; i < (num / 2) + 1; i++) {

            // do the math
            mod = num % i;

            // print output
            if (mod == 0) {

                if (checkSquare(i)) {
                    System.out.println("perfect square factor: " + i);
                }
            }
        }
    }

    public static void main(String[] args) {

        checkSquare(3);

    }

}