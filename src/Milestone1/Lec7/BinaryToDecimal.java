package Milestone1.Lec7;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int decimal = 0;
        int multiplier = 1;
        while(binary > 0){
            int digit = binary % 10;
            decimal = decimal + (digit * multiplier);
            multiplier*=2;
            binary/=10;
        }
        System.out.println(decimal);
    }
}
