package Milestone1.Lec4;

import java.util.Scanner;

public class AlphaPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        while (row <= n) {
            int num = row-1;
            int cst = 1;
            while (cst <= nst) {
                System.out.print((char)('A' + num));
                cst++;
            }
            System.out.println();
            row++;
            nst++;
        }
    }
}