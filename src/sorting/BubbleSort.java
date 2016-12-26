package sorting;

import java.util.Scanner;

/**
 * Created by Tridev on 10-12-2016.
 */
public class BubbleSort {
    private int[] array = new int[10];

    public BubbleSort(int[] inputArray){
        this.array = inputArray;
    }

    public void inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bubble Sort");
        System.out.println("Enter elements of array:");
        for(int i=0 ;i<array.length; i++){
            array[i] = scanner.nextInt();
        }
    }

   public void sortArray(){
       for(int i = 0;i<array.length;i++){
            for(int j =0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }

    public void printArray() {
        System.out.println("Bubble Sort of your array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }


    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort(new int[10]);
        bubbleSort.inputArray();
        bubbleSort.sortArray();
        bubbleSort.printArray();


    }
}
