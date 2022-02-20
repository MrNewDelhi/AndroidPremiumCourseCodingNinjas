package Milestone1.Lec4;

import java.util.Scanner;

public class InterestingAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        while (row <= n) {
            int cst = 1;
            int num = n - row;
            while (cst <= nst) {
                System.out.print((char)('A' + num));
                num++;
                cst++;
            }
            System.out.println();
            row++;
            nst++;
        }
    }
}