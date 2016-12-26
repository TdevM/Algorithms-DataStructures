package sorting;

import java.util.Scanner;

/**
 * Created by Tridev on 10-12-2016.
 */
public class InsertionSort {

   private int[] array = new int[10];

    public InsertionSort(int[] inputArray){
        this.array = inputArray;
    }



    public void inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insertion Sort");
        System.out.println("Enter elements of array:");
        for(int i=0 ;i<array.length; i++){
            array[i] = scanner.nextInt();
        }
    }

    public void printArray() {
        System.out.println("Insertion Sort of your array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public void sortArray(){
        int key,i,j=0;
        for(i=1;i<array.length;i++){

            key = array[i];
            j=i-1;

            while(j>=0 && array[j]>key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }

    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort(new int[10]);
        insertionSort.inputArray();
        insertionSort.sortArray();
        insertionSort.printArray();

    }
}
