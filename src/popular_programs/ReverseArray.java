package popular_programs;

/**
 * Created by Tridev on 10-12-2016.
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i <array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i - 1];
            array[array.length-i - 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]+" ");
        }
    }
}
