package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    static PrintStream out = System.out;

    private static final char sym = '*';
    private static final char sep = ' ';


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        out.print("Введите s:");
        int s = in.nextInt();
        printSendStar(s);
    }

    private static void printSymbols(int a, char ch) {
        for (int i = 1; i <= a; i++) {
            out.print(ch);
        }
    }

    public static void printSendStar(int s) {
        int a = s / 2;
        for (int i = 0; i < s; i++) {
            int offset = Math.abs(i - a);
            int starCount = s - 2 * offset;
            printSymbols(offset, sep);
            printSymbols(starCount, sym);
            out.println();

        }

    }

}
