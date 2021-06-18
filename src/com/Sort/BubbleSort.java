/*
   BubbleSort.java
    
   Created at Jun 17, 3:15 PM:51 
*/
package com.Sort;

/**
 * @author Jeddi
 */
public class BubbleSort
{
    static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    // Driver method to test above
    public static void checkBubbleSort(int N, int[] arr)
    {
        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Bubble Sort
        for (int i = 0; i < N; i++) {
            bubbleSort(arr);
        }

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Jumlah data = " + arr.length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Bubble Sort = " + (timeElapsed / N) + " NanoSecond");

    }
}
