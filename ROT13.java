public class ROT13 {

    /**
     * Preforms ROT13 on a passed string.
     * 
     * @param input string
     * @return the converted string
     */
    public static String rot13(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            if (c >= 'a' && c <= 'm') {
                c += 13;
            } else if (c >= 'A' && c <= 'M') {
                c += 13;
            } else if (c >= 'n' && c <= 'z') {
                c -= 13;
            } else if (c >= 'N' && c <= 'Z') {
                c -= 13;
            }

            sb.append(c);
        }

        return sb.toString();
    }
}
