package IQ;

import java.sql.SQLOutput;

public class question9_min_Value {
    public static void main(String[] args) {



    int array [] = new int[]{1,2,3,4,0};

            int min= getMinValue(array);

        System.out.println("min value is "+ min);

}
public static int getMinValue(int[] ints) {

    int minValue = ints[0];

    for (int i = 1; i < ints.length; i++) {

        if (ints[i] < minValue) {

         minValue= ints[i];
        }

        }
return minValue;
    }




}
