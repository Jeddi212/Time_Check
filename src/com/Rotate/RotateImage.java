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
    public static int[][] clockwise_90(int[][] matrix)
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

    public static int[][] clockwise(int[][] matrix)
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
        }
        return matrix;
    }

    public static int[][] antiClockwise(int[][] matrix)
    {
        int i, j, temp;
        int N = matrix.length;

        for (i = 0; i < N / 2; i++) {
            for (j = i; j < N - i - 1; j++) {
                // Atas -> Temp
                temp = matrix[i][j];

                // Kanan -> Atas
                matrix[i][j] = matrix[j][N - 1 - i];

                // Bawah -> Kanan
                matrix[j][N - 1 - i] = matrix[N - 1 - i][N - 1 - j];

                // Kiri -> Bawah
                matrix[N - 1 - i][N - 1 - j] = matrix[N - 1 - j][i];

                // Temp -> Kiri
                matrix[N - 1 - j][i] = temp;
            }
        }

        return matrix;
    }

    // Method Rotate Image Kel 2
    public static int[][] rotateKel2Kanan(int[][] matrix)
    {
        int[][] hasil = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < hasil.length; ++i) {
            for (int j = 0; j < hasil[i].length; ++j) {
                hasil[i][j] = matrix[matrix.length - j - 1][i];
            }
        }

        return hasil;
    }

    public static int[][] rotateKel2Kiri(int[][] matrix)
    {
        int[][] hasil = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                hasil[j][i] = matrix[i][j];
            }
        }

        return hasil;
    }

    // Method Rotate Image Kel 3
    public static void rotateKel3(RotateThread1 rThread1, RotateThread2 rThread2)
    {
        rThread1.start();
        rThread2.start();

        try { //main thread menunggu kedua thread ini finish
            rThread1.join();
            rThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         // System.out.print("Thread Finish--------------------\n\n");
    }

    // Utilities
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

        //! Loop Rotate Kanan
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
        System.out.println("Lama Proses Rotate Kanan = " + (timeElapsed / N) + " NanoSecond");

    }

    public static void checkRotateKiri(int N, int[][] arr)
    {
        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Rotate Kiri
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
        System.out.println("Lama Proses Rotate Kiri = " + (timeElapsed / N) + " NanoSecond");

    }

    public static void checkClockwise(int N, int[][] arr)
    {
        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop CLock Wise
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
        System.out.println("Lama Proses Rotate ClockWise = " + (timeElapsed / N) + " NanoSecond");

    }

    public static void checkAntiClockwise(int N, int[][] arr)
    {
        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Anti Clockwise
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
        System.out.println("Lama Proses Rotate Anti Clockwise = " + (timeElapsed / N) + " NanoSecond");

    }

    public static void checkRotateKel2(int N, int[][] arr)
    {
        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Rotate Image Kel 2
        for (int i = 0; i < N; i++) {
            rotateKel2Kanan(arr);
        }

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Jumlah data = " + arr.length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Rotate Kel 2 = " + (timeElapsed / N) + " NanoSecond");

    }

    public static void checkRotateKel2Lainnya(int N, int[][] arr)
    {
        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Rotate Image Kel 2
        for (int i = 0; i < N; i++) {
            rotateKel2Kiri(arr);
        }

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Jumlah data = " + arr.length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Rotate Kel 2 Lainnya = " + (timeElapsed / N) + " NanoSecond");

    }

    public static void checkRotateKel3(int N, int[][] arr)
    {
        RotateThread1 rThread1 = new RotateThread1(N, arr);
        RotateThread2 rThread2 = new RotateThread2(N, arr);

        //! Get Start Time
        long startTime = System.nanoTime();

        //! Run Thread
        rotateKel3(rThread1, rThread2);

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Jumlah data = " + arr.length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Rotate Kel 3 (Thread) = " + (timeElapsed / N) + " NanoSecond");

    }

}
