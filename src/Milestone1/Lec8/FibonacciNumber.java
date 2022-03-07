package Milestone1.Lec8;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkMember(n));
    }
    public static boolean checkMember(int n){
        int evaluate1 = (5 * n * n) + 4;
        int evaluate2 = (5 * n * n) - 4;
        for(int i = 1; i * i <= evaluate1; i++){
            int square = i * i;
            if(square == evaluate1 || square == evaluate2){
                return true;
            }
        }
        return false;
    }
}
