package IQ;

public class TachTask {
    public static void main(String[] args) {
        String str = "I love Java";
        String result = "";
        for (int i =  str.length()-1; i > 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);

    }



}
