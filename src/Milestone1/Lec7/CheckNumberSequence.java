package Milestone1.Lec7;

import java.util.Scanner;

public class CheckNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        int count = 2;
        int curr;
        boolean isDec = true;
        while (count <= n) {
            curr = sc.nextInt();
            count++;
            if (curr == prev) {
                System.out.println(false);
                return;
            }
            if (curr < prev) {
                if (!isDec) {
                    System.out.println(false);
                    return;
                }
            } else {
                if (isDec) {
                    isDec = false;
                }
            }
            prev = curr;
        }
        System.out.println(true);
    }
}