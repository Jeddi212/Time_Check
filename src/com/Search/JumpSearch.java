/*
   JumpSearch.java
    
   Created at Jun 18, 4:50 PM:17 
*/
package com.Search;

/**
 * @author Jeddi
 */
public class JumpSearch {
    static int jumpSearch(int[] arr, int x)
    {
        int n = arr.length;

        int step = (int)Math.floor(Math.sqrt(n));

        int prev = 0;
        while (arr[Math.min(step, n)-1] < x)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        while (arr[prev] < x)
        {
            prev++;

            if (prev == Math.min(step, n))
                return -1;
        }

        if (arr[prev] == x)
            return prev;

        return -1;
    }

    // Driver program to test function
    public static void checkJumpSearch(int N, int[] arr, int key)
    {
        int index = -1;

        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Jump Search
        for (int i = 0; i < N; i++) {
            index = jumpSearch(arr, key);
        }

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Data dicari = " + key);
        System.out.println("Index       = " + index);
        System.out.println("Jumlah data = " + arr.length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Jump Search = " + (timeElapsed / N) + " NanoSecond");
    }
}
