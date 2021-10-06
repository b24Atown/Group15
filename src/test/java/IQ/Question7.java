package IQ;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        //we will count the occurences
        //if the occurences are = or more than 1 then true
        //else false
        Scanner input = new Scanner(System.in);
         String str = input.next();
         int countUpper = 0;
         int countLower = 0;
         int countDigits = 0;
         int countSpeacial = 0;
         if(str.length() >=6 && !str.contains(" ")) {
             for (int i = 0; i < str.length(); i++) {
                 char ch = str.charAt(i);
                 if (Character.isUpperCase(ch)) {
                         countUpper++;
                     } else if (Character.isDigit(ch)) {
                         countDigits++;
                     } else if (Character.isLowerCase(ch)) {
                         countLower++;
                     } else if(ch > 32 && ch <= 47 || ch > 58 && ch <= 64 || ch > 91 && ch <= 96 || ch > 123 && ch <= 126 ) {
                         countSpeacial++;
                 }
             }
         } else {
             System.out.println(false);
         }
if(countDigits >= 1 && countLower >= 1 && countUpper >=1 && countSpeacial>=1) {
    System.out.println(true);
}
        
    }

}
