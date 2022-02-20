package Milestone1.Lec6;

import java.util.Scanner;

public class TriangleofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = n-1;
        int nst = 1;
        while (row <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int num1 = row;
            int cst = 1;
            while(cst <= nst){
                System.out.print(num1);
                cst++;
                num1++;
            }
            int num2 = num1-2;
            cst = 1;
            while(cst < nst){
                System.out.print(num2);
                cst++;
                num2--;
            }
            row++;
            nst++;
            nsp--;
            System.out.println();
        }
    }
}
