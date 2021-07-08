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
    public static int[][] rotateKanan(int[][] matrix)
    {
        int temp, i, j;
        int N = matrix.length;

        // Langkah 1 : Transpose Matrix
        for (i = 0; i < N; i++) {
            for (j = (i + 1); j < N; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Langkah 2 : Flip matrix dari kiri ke kanan
        for (i = 0; i < N; i++) {
            for (j = 0; j < (N / 2); j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                matrix[i][N-1-j] = temp;
            }
        }

        return matrix;
    }

    public static int[][] rotateKiri(int[][] matrix)
    {
        int temp, i, j;
        int N = matrix.length;

        // Langkah 1 : Flip matrix dari kiri ke kanan
        for (i = 0; i < N; i++) {
            for (j = 0; j < (N / 2); j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                matrix[i][N-1-j] = temp;
            }
        }

        // Langkah 2 : Transpose Matrix
        for (i = 0; i < N; i++) {
            for (j = (i + 1); j < N; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return matrix;
    }

    // Method Rotate Image 2
    public static int[][] clockwise(int[][] matrix)
    {
        int first, last, offset, temp;
        int N = matrix.length;
        int bingkai = N / 2;

        for (int cycleNum = 0; cycleNum < bingkai; cycleNum++) {
            first = cycleNum;
            last = N - 1 - cycleNum;

            for (int swapRound = first; swapRound < last; swapRound++) {
                offset = swapRound - first;
                temp = matrix[first][swapRound];

                matrix[first][swapRound] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[swapRound][last];
                matrix[swapRound][last] = temp;
            }

        }

        return matrix;
    }

    public static int[][] antiClockwise(int[][] matrix)
    {
        int i, j, temp;
        int N = matrix.length;

        for (i = 0; i < N / 2; i++) {
            for (j = i; j < N - i - 1; j++) {
                temp = matrix[i][j];

                // Move values from right to top
                matrix[i][j] = matrix[j][N - 1 - i];

                // Move values from bottom to right
                matrix[j][N - 1 - i] = matrix[N - 1 - i][N - 1 - j];

                // Move values from left to bottom
                matrix[N - 1 - i][N - 1 - j] = matrix[N - 1 - j][i];

                // Assign temp to left
                matrix[N - 1 - j][i] = temp;
            }
        }

        return matrix;
    }

    public static void printArr(int[][] matrix)
    {
        for (int[] baris : matrix) {
            for (int angka : baris) {
                System.out.print(angka);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void checkRotateKanan(int N, int[][] arr)
    {
        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Bubble Sort
        for (int i = 0; i < N; i++) {
            rotateKanan(arr);
        }

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Jumlah data = " + arr.length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Rotate 1 = " + (timeElapsed / N) + " NanoSecond");

    }

    public static void checkRotateKiri(int N, int[][] arr)
    {
        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Bubble Sort
        for (int i = 0; i < N; i++) {
            rotateKiri(arr);
        }

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Jumlah data = " + arr.length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Rotate 1 = " + (timeElapsed / N) + " NanoSecond");

    }

    public static void checkClockwise(int N, int[][] arr)
    {
        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Bubble Sort
        for (int i = 0; i < N; i++) {
            clockwise(arr);
        }

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Jumlah data = " + arr.length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Rotate 2 = " + (timeElapsed / N) + " NanoSecond");

    }

    public static void checkAntiClockwise(int N, int[][] arr)
    {
        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Bubble Sort
        for (int i = 0; i < N; i++) {
            antiClockwise(arr);
        }

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Jumlah data = " + arr.length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Rotate 3 = " + (timeElapsed / N) + " NanoSecond");

    }

/*    checkClockwise(N, rarr9);
        System.out.println();
//        printArr(clockwise(rarr9));

    checkAntiClockwise(N, rarr9);
        System.out.println();
//        printArr(antiClockwise(rarr9));*/

}
