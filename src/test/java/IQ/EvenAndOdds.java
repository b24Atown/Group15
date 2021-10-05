package IQ;

public class EvenAndOdds {
    public static void main(String[] args) {
        // to start ive hardcoded variables
        int[] nums = {2, 15, 24, 37, 40};

        // ive set up an empty string so I can show even numbers

        String evenNumbers = " ";
        String oddNumbers = " ";
        // I will start with a traditional for loop approach

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                // doing this will print the number without doing math
                evenNumbers += nums[i] + ", ";
            } else {

                oddNumbers += nums[i] + ", ";
            }
        }

        // now i print even and odd number
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }
}
