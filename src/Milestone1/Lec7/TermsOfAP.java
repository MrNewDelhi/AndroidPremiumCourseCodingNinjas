package Milestone1.Lec7;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1, total=1; total <= n; i++){
            int output = (3*i)+2;
            if(output % 4 == 0){
                continue;
            }
            System.out.println(output);
            total++;
        }
    }
}
