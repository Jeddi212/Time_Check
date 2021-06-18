/*
   BucketSort.java
    
   Created at Jun 17, 3:33 PM:58 
*/
package com.Sort;

import java.util.*;

/**
 * @author Jeddi
 */
public class BucketSort {

    // Function to sort arr[] of size n
    // using bucket sort
    static void bucketSort(float[] arr, int n)
    {
        if (n <= 0)
            return;

        // 1) Create n empty buckets
        @SuppressWarnings("unchecked")
        Vector<Float>[] buckets = new Vector[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }

        // 2) Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            float idx = arr[i] * n;
            buckets[(int)idx].add(arr[i]);
        }

        // 3) Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // 4) Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    // Driver code
    public static void checkBucketSort(int N)
    {
        float[] arr = { (float)0.897, (float)0.565,
                (float)0.656, (float)0.1234,
                (float)0.665, (float)0.3434 };

        int n = arr.length;

        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Bucket Sort
        for (int i = 0; i < N; i++) {
            bucketSort(arr, n);
        }

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Jumlah data = " + arr.length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Bucket Sort = " + (timeElapsed / N) + " NanoSecond");

    }
}
