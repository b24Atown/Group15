package IQ;

public class MaxNUmArr {
    public static void main(String[] args) {
        int [] anArray = {5,3,5,10,4,-2};

        int maxNumber = anArray[0];

        for (int i = 0; i < anArray.length; i++) {
            if(anArray[i] > maxNumber) {
                maxNumber = anArray[i];
            }
        }

        System.out.println(maxNumber);


    }

}
