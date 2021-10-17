package IQ;

public class question10findMaxInt {

    public static void main(String args[]) {

        int array[] = new int[]{1, 2, 3, 4, 5};

        int max = getMaxValue(array);
        System.out.println("max value is : " +max);
    }


    public static int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        //.out.println(maxValue);
        return maxValue;
    }


}


