package Milestone1.Lec6;

import java.util.Scanner;

public class MirrorImageNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int nsp = n-1;
        while(row <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while(cst <= nst){
                System.out.print(cst);
                cst++;
            }
            System.out.println();
            row++;
            nst++;
            nsp--;
        }
    }
}
