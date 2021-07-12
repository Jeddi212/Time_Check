/*
   RotateThread1.java
    
   Created at Jul 13, 12:09 AM:01 
*/
package com.Rotate;

import static com.Main.rarr9;

/**
 * @author Jeddi
 */
public class RotateThread1 extends Thread {

    int N;

    public RotateThread1(int n) {
        this.N = n;
    }

    // Method Rotate Image Kel 3
    public static void rotateKel3Thread1(int[][] matrix)
    {
        int i, j, temp;
        int N = matrix.length;

        for (i = 0; i < N / 2; i++) {
            for (j = i; j < N - i - 1; j++) {
                // Atas -> Temp
                temp = matrix[i][j];

                // Kiri -> Atas
                matrix[i][j] = matrix[N - 1 - j][i];

                // Bawah -> Kiri
                matrix[N - 1 - j][i] = matrix[N - 1 - i][N - 1 - j];

                // Kanan -> Bawah
                matrix[N - 1 - i][N - 1 - j] = matrix[j][N - 1 - i];

                // Temp -> Kanan
                matrix[j][N - 1 - i] = temp;
            }
            i++;
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < N; i++) {
            rotateKel3Thread1(rarr9);
        }
    }

}
