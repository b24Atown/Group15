package IQ;

import java.util.Arrays;

public class Question2 {

    //    Q2: String -- Same letters
    //    Write a return method that check if a string is build out of the same letters as another string.
//    Ex:  same("abc",  "cab"); -> true
//    same("abc",  "abb"); -> false:


    public static void main(String[] args) {
        System.out.println(isSame2("abc", "cba"));
    }

    public static boolean isSame2(String one, String two) {


        char[] newOne = one.toCharArray();
        char[] newTwo = two.toCharArray();

        Arrays.sort(newOne);
        Arrays.sort(newTwo);
        boolean result;

        System.out.println("Is anagram");
        result = Arrays.equals(newOne, newTwo);

        return result;

    }


}


