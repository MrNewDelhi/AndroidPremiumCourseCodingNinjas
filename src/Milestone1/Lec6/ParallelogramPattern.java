package Milestone1.Lec6;

import java.util.Scanner;

public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = 0;
        while(row <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while(cst <= n){
                System.out.print("*");
                cst++;
            }
            System.out.println();
            nsp++;
            row++;
        }
    }
}
