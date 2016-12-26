package sorting;

import java.util.Scanner;

/**
 * Created by Tridev on 10-12-2016.
 */
public class MergeSort {

                                                                                                              
    private int[] array = new int[10];

    public MergeSort(int[] inputArray){
        this.array = inputArray;
    }

    public void inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Merge Sort");
        System.out.println("Enter elements of array:");
        for(int i=0 ;i<array.length; i++){
            array[i] = scanner.nextInt();
        }
    }

    public void printArray() {
        System.out.println("Merge Sort of your array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    private  void mergeArrays(){

    }

    public void sortArrayMerge(int[] arr, int l, int r){

        int mid = (l+r)/2;
        if(l<r){
            sortArrayMerge(arr,0,mid-1);
            sortArrayMerge(arr,mid,arr.length);
            mergeArrays();

        }

    }


    public static void main(String[] args) {
        int[] arr = new int[10];
         MergeSort mergeSort = new MergeSort(arr);
//         mergeSort.inputArray();
//         mergeSort.printArray();



    }

}
