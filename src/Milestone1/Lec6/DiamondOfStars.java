package Milestone1.Lec6;

import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int row = 1;
        int nsp = n/2;
        int nst = 1;
        while(row <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            cst = 2;
            while(cst <= nst) {
                System.out.print("*");
                cst++;
            }
            row++;
            if(row <= (n+1)/2){
                nst++;
                nsp--;
            }
            else{
                nst--;
                nsp++;
            }
            System.out.println();
        }
    }
}
