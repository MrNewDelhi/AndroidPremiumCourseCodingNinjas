package Milestone1.Lec6;

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = 0;
        int nst = 1;
        int sum = 0;
        while(row <= n){
            int cst = 1;
            while(cst < nst){
                System.out.print(cst + "+");
                cst++;
            }
            sum += nst;
            System.out.println(nst + "=" + sum);
            nst++;
            row++;
        }
    }
}
