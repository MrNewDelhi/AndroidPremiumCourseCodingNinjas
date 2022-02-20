package Milestone1.Lec6;

import java.util.Scanner;

public class InvertedNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = n;
        while(row <= n){
            int cst = 1;
            while(cst <= nst){
                System.out.print(nst);
                cst++;
            }
            System.out.println();
            row++;
            nst--;
        }
    }
}