package com.DSALGO;

public class BitManipulaton1 {
//    How to calculate power of 2 in given number

    static boolean isPowerBitM(int n) {
        return (n&(n-1)) == 0;
    }

    public static void main(String[] args) {
       boolean ans = isPowerBitM(16);
        System.out.println(ans);
    }
}
