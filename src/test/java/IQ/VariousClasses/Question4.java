package IQ.VariousClasses;

public class Question4 {
    //Add "hello world"
    public static void main(String[] args) {

        //Q4: String -- Find the unique
        //Write a return  method that can find the unique characters from the String
        //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";


        System.out.println(unique("AAABBBCCCDEF"));



    }

    public static String  unique(String word) {
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result += word.charAt(i);
            }
        }
        // System.out.println(result);
        return result;

    }
}
