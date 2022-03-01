package Milestone1.Lec6;

import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = n;
        while(row <= n){
            int cst = row;
            int num = row-1;
            while(cst <= n){
                System.out.print(cst+num);
                cst++;
                num++;
            }
            int nst1 = n - nst;
            cst = 1;
            num = 0;
            while(cst <= nst1){
                System.out.print(cst+num);
                cst++;
                num++;
            }
            row++;
            nst--;
            System.out.println();
        }
    }
}
