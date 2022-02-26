package Milestone1.Test1;

import java.util.Scanner;

public class NumberStarPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = n-1;
        while (row <= n){
            int cst = 1;
            int num = n;
            while(cst <= nst){
                System.out.print(num);
                cst++;
                num--;
            }
            System.out.print("*");
            cst++;
            num--;
            while(cst <= n){
                System.out.print(num);
                num--;
                cst++;
            }
            row++;
            nst--;
            System.out.println();
        }
    }
}
