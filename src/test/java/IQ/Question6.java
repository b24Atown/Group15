package IQ;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "DC501GCCCA089811";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            result += word.charAt(i);
            if(Character.isAlphabetic(word.charAt(i)) && i<word.length()-1 &&Character.isDigit(word.charAt(i+1))) {
                result += " ";
            } else if(Character.isDigit(word.charAt(i)) && i<word.length()-1 && Character.isAlphabetic(word.charAt(i+1))) {
                result += " ";
            }
        }
        System.out.println(result);
        String [] arr = result.split(" ");
        System.out.println(Arrays.toString(arr));
word = "";
        for (int i = 0; i < arr.length; i++) {
            char [] arr2 = arr[i].toCharArray();
            Arrays.sort(arr2);
            for (int j = 0; j < arr2.length; j++) {
                word += arr2[j];
            }
        }
        System.out.println(word);
    }
}
