package Milestone1.Lec6;

import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = 0;
        while (row <= n) {
            System.out.print("*");
            int csp = 1;
            while(csp <= nsp){
                System.out.print(csp);
                csp++;
            }
            csp -=2;
            while(csp >= 1){
                System.out.print(csp);
                csp--;
            }
            nsp++;
            row++;
        }
    }
}