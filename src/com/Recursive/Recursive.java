/*
   Recursive.java
    
   Created at Jun 17, 12:37 PM:38 
*/
package com.Recursive;

/**
 * @author Jeddi
 */
public class Recursive {

    // RECURSIVE
    public static Integer factorialRecursive(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * factorialRecursive(n-1);
        }
    }

    public static void checkRecursive(int n) {
        long startTime = System.currentTimeMillis();

        long hasil = 0;

        // LOOP
        for (int i = 0; i < 1000000; i++) {
            hasil = factorialRecursive(n);
        }

        System.out.print(hasil);
        System.out.println();

        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed);
    }
}
