package IQ;

public class Question5 {

            public static void main(String[] args) {


        /*
    Q5: String -- Reverse
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
     */

            String word = "ABCD";
            String result = "";

            for (int i = word.length()-1; i >= 0; i--){
                result+= word.charAt(i);

            }
            System.out.println(result);



        }
    }
