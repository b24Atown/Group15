package IQ;

public class Question1 {

    public static void main(String[] args) {

        //Q1: String -- Frequency of Characters
        //Write a return method that can find the frequency of characters Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        System.out.println(frequencyOfCharacters("AABBCDD"));


    }

    public static String frequencyOfCharacters(String str) {
        //String str = aabbccd
        //            aa
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                result += str.charAt(i) + "" + count;
            }
        }
        return result;
    }
}
