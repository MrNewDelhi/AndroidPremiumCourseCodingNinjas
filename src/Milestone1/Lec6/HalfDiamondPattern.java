package Milestone1.Lec6;

import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = (n*2)+1;
        int row = 2;
        int nsp = 1;
        System.out.println("*");
        while (row < n) {
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
            System.out.println("*");
            row++;
            if(row <= (n+1)/2){
                nsp++;
            }
            else{
                nsp--;
            }
        }
        System.out.println("*");
    }
}