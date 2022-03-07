package Milestone2.Test2;

import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        leaders(input);
    }

    public static void leaders(int[] input) {
        int size = input.length;
        for (int i = 0; i < size - 1; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < size; j++) {
                if (input[i] < input[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.print(input[i] + " ");
            }
        }
        System.out.print(input[size - 1]);
    }
}
