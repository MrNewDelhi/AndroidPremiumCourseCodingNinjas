package Milestone1.Lec7;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        long binary = 0;
        long multiplier = 1L;
        while(decimal > 0){
            int digit = (decimal % 2);
            binary = (digit * multiplier) + binary;
            decimal /= 2;
            multiplier *= 10L;
        }
        System.out.println(binary);
    }
}
