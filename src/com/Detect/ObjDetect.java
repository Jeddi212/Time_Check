/*
   ObjDetect.java
    
   Created at Jul 03, 7:30 PM:52 
*/
package com.Detect;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jeddi
 */
public class ObjDetect {

    public static void objDetect(int[][] arr) {
        int i, j, hasil = 0;

        boolean cek = true;
        boolean already = true;

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    if (i == 0 && j == 0) {
                        hasil++;
                    } else if (i == 0) {
                        if (arr[i][j-1] != 1) {
                            hasil++;
                        }
                    } else if (j == 0) {
                        if (arr[i-1][j] != 1) {
                            hasil++;
                            while (cek && j < arr[i].length - 1) {
                                if (arr[i][j + 1] == 1) {
                                    if (arr[i - 1][j + 1] == 1) {
                                        if (!already) {
                                            hasil--;
                                            already = true;
                                        }
                                    } else {
                                        already = false;
                                    }
                                } else {
                                    cek = false;
                                }
                                j++;
                            }
                            cek = true;
                        }
                    } else {
                        if (arr[i-1][j] != 1 && arr[i][j-1] != 1) {
                            hasil++;
                            while (cek && j < arr[i].length - 1) {
                                if (arr[i][j + 1] == 1) {
                                    if (arr[i - 1][j + 1] == 1) {
                                        if (!already) {
                                            hasil--;
                                            already = true;
                                        }
                                    } else {
                                        already = false;
                                    }
                                } else {
                                    cek = false;
                                }
                                j++;
                            }
                            cek = true;
                        } else if (j < arr[i].length - 1) {
                            if (arr[i][j + 1] == 1) {
                                while (cek && j < arr[i].length - 1) {
                                    if (arr[i][j + 1] == 1) {
                                        if (arr[i - 1][j + 1] == 1) {
                                            if (arr[i - 1][j] == 1) {
                                                already = true;
                                            }
                                            if (!already) {
                                                hasil--;
                                                already = true;
                                            }
                                        } else {
                                            already = false;
                                        }
                                    } else {
                                        cek = false;
                                    }
                                    j++;
                                }
                                cek = true;
                            }
                        }
                        already = false;
                    }
                }
            }
        }

//        System.out.println(
//                "Banyak objek \n" +
//                "dalam array  = " + hasil
//        );
    }

    public static void objKel3(int[][] arr_grid) {
        int rows = arr_grid.length;
        int cols = arr_grid[0].length;

        int total = rows * cols;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr_grid[i][j] == 1) {
                    arr_grid[i][j] = total;
                    total = total - 1;
                }
            }
        }

        boolean cek = false;

        while (!cek) {
            cek = true;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    int row_next = i + 1;
                    int row_prev = i - 1;
                    int col_next = j + 1;
                    int col_prev = j +-1;

                    if (arr_grid[i][j] != 0) {
                        if (row_prev >= 0 && arr_grid[row_prev][j] > arr_grid[i][j]) {
                            arr_grid[i][j] = arr_grid[row_prev][j];
                            cek = false;
                        }
                        if (col_prev >= 0 && arr_grid[i][col_prev] > arr_grid[i][j]) {
                            arr_grid[i][j] = arr_grid[i][col_prev];
                            cek = false;
                        }
                        if (row_next < rows && arr_grid[row_next][j] > arr_grid[i][j]) {
                            arr_grid[i][j] = arr_grid[row_next][j];
                            cek = false;
                        }
                        if (col_next < cols && arr_grid[i][col_next] > arr_grid[i][j]) {
                            arr_grid[i][j] = arr_grid[i][col_next];
                            cek = false;
                        }
                    }
//                    System.out.print(arr_grid[i][j] + " ");
                }
//                System.out.println();
            }
//            System.out.println();
        }
//        System.out.println();
//        System.out.println();

        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                hashSet.add(arr_grid[i][j]);
            }
        }
//        System.out.println("\nBanyak = " + (hashSet.size() - 1));
    }

    public static void checkKel1(int N, int[][] arr) {

        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Bubble Sort
        for (int i = 0; i < N; i++) {
            objDetect(arr);
        }

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Jumlah data = " + arr.length * arr[0].length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Objek Detection Kel 1 = " + (timeElapsed / N) + " NanoSecond");

    }

    public static void checkKel3(int N, int[][] arr) {

        //! Get Start Time
        long startTime = System.nanoTime();

        //! Loop Bubble Sort
        for (int i = 0; i < N; i++) {
            objKel3(arr);
        }

        //! Get Finish Time
        long endTime = System.nanoTime();

        //! Calculate Process Time
        long timeElapsed = endTime - startTime;

        System.out.println("Jumlah data = " + arr.length * arr[0].length);
        System.out.println("Jumlah loop = " + N);
        System.out.println("-------------------------------------------");
        System.out.println("Lama Proses Objek Detection Kel 3 = " + (timeElapsed / N) + " NanoSecond");

    }

}
