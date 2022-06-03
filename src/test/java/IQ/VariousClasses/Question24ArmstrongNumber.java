package IQ.VariousClasses;

import java.util.Scanner;

public class Question24ArmstrongNumber {

        /*
        24. Numbers -- Armstrong numbers
    Write a method that can check if a number is Armstrong  number
    ****An Armstrong number is a 3 digit number for which the sum of cube of its digits is equal to the number itself. One of the popular examples of the Armstrong number is 153 as 153= 1+ 125+27 which is equal to 1^3+5^3+3^3 which is equal to the sum of cube of its digits 1, 5, and 3.
         */
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = input.nextInt();
//* - times
            if(isArmstrong(num)) {
                System.out.println(num + " is an Armstrong number.");
            }else{
                System.out.println(num + " is not an Armstrong number.");
            }
        }

        public static boolean isArmstrong(int n) {
            int originalNum, remainder;
            int result = 0;
            originalNum = n;

            while (originalNum != 0) {
                remainder = originalNum % 10;  //first it: 3; sec it:5; third it: 1
                result = result + (remainder * remainder * remainder); //first it: 27//sec it:  27+125//third it: 1+152 = 153
                originalNum = originalNum / 10;//first it: 15; sec it: 1
            }
            if (result == n)
                return true;

            else return false;
        }

    }


