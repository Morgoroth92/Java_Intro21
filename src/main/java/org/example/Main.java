package org.example;

public class Main {
    public static void main(String[] args) {
        numeriNaturali(7, 2);
    }
    public static void numeriNaturali(int n, int l) {
        for (int i = n; n > l; n--) {
            System.out.println(n);
        }
    }
}