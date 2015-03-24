package nyc.c4q.abassawo;

public class repeat {

    public static String rePeat$(String x, int count) {
        String result = "";
        int lengthOfWord = 0;
            for (int i = 0; i <= count - 1; i++) {
                result+= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(rePeat$("abc", 11));
        //ePeat$("abc", 11);
    }


}
