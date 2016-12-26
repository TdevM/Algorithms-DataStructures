package popular_programs;

import java.util.Arrays;

/**
 * Created by Tridev on 26-12-2016.
 */
public class PrefixAverages {


    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        PrefixAverages prefixAverages = new PrefixAverages();
        prefixAverages.approachOne(array);
        prefixAverages.approachTwo(array);
    }

    public void approachOne(int[] array) {         //Takes O(n^2)
        int[] resultArray = new int[10];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum = sum + array[j];
                resultArray[j] = sum;
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }

    public void approachTwo(int[] array) {          //Better Solution O(n)
        int[] resultArray = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            resultArray[i] = sum;
        }
        System.out.println(Arrays.toString(resultArray));
    }

}
