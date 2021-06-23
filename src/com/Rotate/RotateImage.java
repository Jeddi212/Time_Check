/*
   RotateImage.java
    
   Created at Jun 23, 10:59 AM:59 
*/
package com.Rotate;

/**
 * @author Jeddi
 */
public class RotateImage {

    // Method Rotate Image
    public static int[][] rotateImage(int[][] matrix) {
        int N = matrix.length;

        // Langkah 1 : Transpose Matrix
        for (int i = 0; i < N; i++) {
            for (int j = (i + 1); j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Langkah 2 : Flip matrix dari kiri ke kanan
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (N / 2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                matrix[i][N-1-j] = temp;
            }
        }

        return matrix;
    }

    public static void printArr(int[][] matrix) {
        for (int[] baris : matrix) {
            for (int angka : baris) {
                System.out.print(angka);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

}
