package com.DSALGO;

public class BitManipulation2 {
//    count 1 in a given number
    static int count1Bit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n&(n-1);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count1Bit(2));
    }
}
