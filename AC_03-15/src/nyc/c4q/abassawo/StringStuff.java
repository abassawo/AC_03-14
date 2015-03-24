package nyc.c4q.abassawo;


public class StringStuff {

    /**
     * @param input The string to reverse.
     * @return A new string constructed by reversing `input`.
     */
    public static String reverse(String input) {
        int numChars = input.length();
        String result = "";
        for (int i = numChars - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }

    /**
     * Prints a string reversed, i.e. back to front.
     */
    public static void printReverse(String input) {
        System.out.println(reverse(input));
    }

    public static String repeat(char c, int count) {
        String result = "";
        for (int i = 0; i < count; ++i) {
            result += c;
        }
        return result;
    }

  
    }
    public static String substring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static String substring(String text, int start) {
        return substring(text, start, text.length());
    }

    public static void main(String[] args) {
        printBox("Hello World");
        printBox("Abass S. Bayo-Awoyemi");
        System.out.println(pad("Abass", 12, '-', true));
        System.out.println(swapHalf("HELLO WORLD"));
        System.out.print(swapHalf("hello, world!"));
    }

    public static void printBox(String wordtoPrint) {
        System.out.println("+" + (repeat('-', wordtoPrint.length() + 2) + "+"));
        System.out.println("|" + wordtoPrint + "  " + "|");
        System.out.println("+" + (repeat('-', wordtoPrint.length() + 2) + "+"));
    }

    public static String pad(String hello, int length, char padChar, boolean left) {
        String padding = repeat(padChar, length - hello.length());
        if (left)
            return padding + hello;
        else
            return hello + padding;

    }


    public static String swapHalf(String text) {
        int halfWay = (text.length()/2);
        return text.substring(halfWay) + text.substring(0, halfWay);
    }

    public static String substring(String text, text.length(), 1) {
        String result = "";
        for (int i = text.length(); i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }


}