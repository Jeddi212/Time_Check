/*
   InsertionSort.java
    
   Created at Jun 17, 3:21 PM:22 
*/
package com;

/**
 * @author Jeddi
 */
public class InsertionSort {
    /*Function to sort array using insertion sort*/
    static void sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void checkInsertionSort(int N, int[] arr)
    {
        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Insertion Sort
        for (int i = 0; i < N; i++) {
            sort(arr);
        }

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Jumlah data = " + arr.length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Insertion Sort = " + (timeElapsed / N) + " NanoSecond");
    }
}
