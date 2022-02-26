package com.DSALGO;

public class Main {
    static void getBit(int n, int pos) {
        int bitMask = 1<<pos;
        if((bitMask&n) == 0) {
            System.out.println("Bit is 0");
        }
        if((bitMask&n) == 1) {
            System.out.println("Bit is 1");
        }
    }
    static int setBit(int n, int pos) {
        int bitMask = 1<<pos;
        int newNum = (bitMask | n);
        return newNum;
    }
    static int clearBit(int n, int pos) {
        int bitMask = 1<<pos;
        int newBitMask = ~(bitMask);
        int newNum = (newBitMask & n);
        return newNum;
    }
    static int updateBit(int n, int posss) {
        int clrBit = clearBit(n,posss);
        int setBit = (clrBit);
        return setBit;
    }
    public static void main(String[] args) {
	// write your code here
    int up = updateBit(2 ,1);
        System.out.println(up);
    }
}
