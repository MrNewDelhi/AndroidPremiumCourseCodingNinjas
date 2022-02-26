package Milestone2.Arrays1;

import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int index = 0; index < size; index++) {
                arr[index] = sc.nextInt();
            }
            System.out.println(findUnique(arr));
            testcases--;
        }
    }

    public static int findUnique(int[] arr) {
        int num = 0;
        for (int index_i = 0; index_i < arr.length; index_i++) {
            boolean unique = true;
            if (arr[index_i] != -1) {
                for (int index_j = index_i + 1; index_j < arr.length; index_j++) {
                    if (arr[index_j] != -1 && arr[index_i] == arr[index_j]) {
                        arr[index_j] = -1;
                        arr[index_i] = -1;
                        unique = false;
                        break;
                    }
                }
                if (unique) {
                    num = (arr[index_i]);
                    break;
                }
            }
        }
        return num;
    }
}
