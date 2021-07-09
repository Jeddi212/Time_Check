/*
   ObjDetect.java
    
   Created at Jul 03, 7:30 PM:52 
*/
package com.Detect;

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
//                            while (cek && j < arr[i].length - 1) {
//                                if (arr[i][j + 1] == 1) {
//                                    if (arr[i - 1][j + 1] == 1) {
//                                        if (!already) {
//                                            hasil--;
//                                            already = true;
//                                        }
//                                    } else {
//                                        already = false;
//                                    }
//                                } else {
//                                    cek = false;
//                                }
//                                j++;
//                            }
//                            cek = true;
                        }/* else if (arr[i][j + 1] == 1) {
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
                        }*/
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
//            already = false;
        }

        System.out.println(
                "Banyak objek \n" +
                "dalam array  = " + hasil
        );
    }

}
