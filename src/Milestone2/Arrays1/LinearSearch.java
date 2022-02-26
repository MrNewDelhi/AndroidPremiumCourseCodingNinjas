package Milestone2.Arrays1;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases > 0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int index = 0; index < size; index++){
                arr[index] = sc.nextInt();
            }
            int x = sc.nextInt();
            System.out.println(linearsearch(arr, x));
            testcases--;
        }
    }
    public static int linearsearch(int[] arr, int x){
        int index = 0;
        for (int element : arr) {
            if (element == x) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
