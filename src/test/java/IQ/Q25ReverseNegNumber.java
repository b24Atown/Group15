package IQ;

import java.util.Scanner;

public class Q25ReverseNegNumber {
     /* 25. Number -- Reverse negative number
    Write a return method that can reverse negative number and return it as int
*/

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number that you want to reverse:");
            int number = input.nextInt();
            System.out.println(reverseInteger(number));

        }


        public static int reverseInteger(int number) {

            int reversedNumber = 0;

            if(number<0){
                number = - number;
            }
            while (number > 0) {
                int num = number % 10;
                reversedNumber = reversedNumber * 10 + num;
                number = number / 10;
            }
            return -reversedNumber;
        }
    }
    

