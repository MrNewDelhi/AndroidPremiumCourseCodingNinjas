package Milestone2.Arrays1;

import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {
            int size1 = sc.nextInt();
            int[] arr1 = new int[size1];
            for (int index = 0; index < size1; index++) {
                arr1[index] = sc.nextInt();
            }
            int size2 = sc.nextInt();
            int[] arr2 = new int[size2];
            for (int index = 0; index < size2; index++) {
                arr2[index] = sc.nextInt();
            }
            findIntersection(arr1,arr2);
            testcases--;
        }
    }
    public static void findIntersection(int[] arr1, int[] arr2){
        for (int element1 : arr1) {
            for (int index_j = 0; index_j < arr2.length; index_j++) {
                if (arr2[index_j] != -1 && element1 == arr2[index_j]) {
                    System.out.print(element1 + " ");
                    arr2[index_j] = -1;
                    break;
                }
            }
        }
        System.out.println();
    }
}
