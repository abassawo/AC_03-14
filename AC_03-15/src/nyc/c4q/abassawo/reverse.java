package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/15/15.
 */

public class reverse {
    public static void main(String[] args) {
        String text = "Hello, World!";
        reverse(text);

    }

    public static String reverse(String input) {

        int numChars = input.length();
        String result = "";

        for (int i = numChars - 1; i >= 0; i--) result += input.charAt(i);
        return result;
    }

    public static void printReverse(String input) {
        System.out.println(reverse(input));
    }
}





