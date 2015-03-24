package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/15/15.
 */
public class Trippling {


    public static String subString (String text, int start, int end){
        String result = "";
        int textEnd = text.length() - 1;
        for (int i = start; i < end; ++i) {
            result += text.charAt(textEnd);
        } return result;
    }

    public static void main(String[] args) {
        String text = "Wassup access Code.";
        System.out.println(subString(text, 0, text.length()));
    }

}
