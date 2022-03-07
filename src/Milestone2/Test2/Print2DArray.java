package Milestone2.Test2;

import java.util.Arrays;
import java.util.Scanner;

public class Print2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] input = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                input[i][j] = sc.nextInt();
            }
        }
        print2DArray(input);
    }

    public static void print2DArray(int input[][]) {
        int row = input.length;
        for (int[] ints : input) {
            for (int j = row; j > 0; j--) {
                System.out.println(Arrays.toString(ints));
            }
        }
    }
}
