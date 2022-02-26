package Milestone1.Test1;

import java.util.Scanner;

public class zerosAndStarsPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int nsp2 = n-1;
        int nsp1 = 0;
        while(row <= n){
            int csp = 1;
            while(csp <= nsp1){
                System.out.print(0);
                csp++;
            }

            System.out.print("*");

            csp = 1;
            while(csp <= nsp2){
                System.out.print(0);
                csp++;
            }

            System.out.print("*");

            csp = 1;
            while(csp <= nsp2){
                System.out.print(0);
                csp++;
            }
            System.out.print("*");
            csp = 1;
            while(csp <= nsp1){
                System.out.print(0);
                csp++;
            }
            row++;
            nsp1++;
            nsp2--;
            System.out.println();
        }
    }
}
