package Milestone1.Test1;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int original1 = n;
        int numberOfDigits = 0;
        int num = 0;
        while(n > 0){
            numberOfDigits += 1;
            n/=10;
        }
        while(original > 0){
            int digit = original % 10;
            num += (int)(Math.pow(digit,numberOfDigits));
            original/=10;
        }
        if(original1 == num){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
}
