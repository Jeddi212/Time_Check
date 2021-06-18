/*
   BinarySearch.java
    
   Created at Jun 18, 4:25 PM:39 
*/
package com.Search;

/**
 * @author Jeddi
 */
public class BinarySearch {
    static int binarySearch(int[] arr, int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    public static void checkBinarySearch(int N, int[] arr, int key)
    {
        int number = -1;

        int last = arr.length - 1;

        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Binary Search
        for (int i = 0; i < N; i++) {
            number = binarySearch(arr, 0, last, key);
        }

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Data dicari = " + key);
        System.out.println("Hasil       = " + number);
        System.out.println("Jumlah data = " + arr.length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Binary Search = " + (timeElapsed / N) + " NanoSecond");
    }
}
