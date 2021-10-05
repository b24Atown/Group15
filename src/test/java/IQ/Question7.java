package IQ;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        //test
        Scanner input = new Scanner(System.in);
        String str = "";
        String word = input.next();
        int x = word.length();

        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                char y = word.charAt(i);
                str = str + y + " ";
            }
        }
        System.out.println(str);

    }
}
