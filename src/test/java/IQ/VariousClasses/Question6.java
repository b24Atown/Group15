package IQ.VariousClasses;

import java.util.Arrays;

public class Question6 {

    /*
Q6: String -- Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
*/
    public static void main(String[] args) {

        String word = "DC501GCCCA098911";
        String newWord = "";

        for (int i = 0; i<word.length();i++){
            newWord+= word.charAt(i);
            if(Character.isAlphabetic(word.charAt(i)) && i<word.length()-1 && Character.isDigit(word.charAt(i+1))){
                newWord+= " ";
            }else if(Character.isDigit(word.charAt(i)) && i<word.length()-1 && Character.isAlphabetic(word.charAt(i+1))){
                newWord+= " ";
            }
        }
        System.out.println(newWord);

        String [] arr = newWord.split(" ");
        System.out.println(Arrays.toString(arr));
        word = "";

        for (int i = 0; i<arr.length;i++){
            char [] arr2 = arr[i].toCharArray();
            Arrays.sort(arr2);
            for (int j = 0; j<arr2.length;j++){
                word+= arr2[j];
            }
        }
        System.out.println(word);
    }
}