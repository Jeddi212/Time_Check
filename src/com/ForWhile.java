/*
   ForWhile.java
    
   Created at Jun 17, 12:34 PM:49 
*/
package com;

/**
 * @author Jeddi
 */
public class ForWhile {

    // FOR
    public static void checkFOR() {
        int i;
        long waktuSelesai, waktuMulai, j = 0;

        waktuMulai = System.currentTimeMillis();
        System.out.println("FOR");
        for (i = 0; i < 100000; i++) {
            j += i;
            if (i == 99999) {
                System.out.println("DONE " + j);
            }
        }
        waktuSelesai = System.currentTimeMillis();
        System.out.println("--> Lama Proses FOR = " + (waktuSelesai - waktuMulai) + "ms");
    }

    // WHILE
    public static void checkWhile() {
        int i;
        long waktuSelesai, waktuMulai, j = 0;

        waktuMulai = System.currentTimeMillis();
        System.out.println("WHILE");
        i = 0;
        while(i < 100000) {
            j += i;
            if (i == 99999) {
                System.out.println("DONE " + j);
            }
            i++;
        }
        waktuSelesai = System.currentTimeMillis();
        System.out.println("--> Lama Proses WHILE = " + (waktuSelesai - waktuMulai) + "ms");
    }

}
