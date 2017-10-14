package com.company;
import java.util.*;


public class Main {
    public static int hex2Decimal(String j) {
        String hexMap = "0123456789ABCDEF";
        j = j.toUpperCase();
        int val = 0;
        for (int i = 0; i < j.length(); i++) {
            char c = j.charAt(i);
            int d = hexMap.indexOf(c);
            if (d != -1) {
                val = 16 * val + d;
            }
        }
        return val;
    }
    public static void main(String[] args) {
        int decimal = hex2Decimal(args[0]);
        System.out.println(decimal);
    }
}
