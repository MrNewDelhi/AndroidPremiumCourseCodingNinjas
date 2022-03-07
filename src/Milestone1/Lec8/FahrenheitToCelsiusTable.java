package Milestone1.Lec8;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();
        printFahrenheitTable(s, e, w);
    }
    public static void printFahrenheitTable(int start, int end, int step) {
        for (;start <= end; start+=step) {
            int c = (int)((5/9.0f) * (start - 32));
            System.out.println(start + "\t" + c);
        }
    }
}
