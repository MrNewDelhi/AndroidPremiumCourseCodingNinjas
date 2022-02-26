package Milestone2.Arrays1;

import java.util.Scanner;

public class ArrangeNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            arrange(arr, size);
            for (int element :
                    arr) {
                System.out.println(element);
            }
            testcases--;
        }
    }

    public static void arrange(int[] arr, int n) {
        int num = 1;
        int mid = (n+1)/2;
        for (int index = 0; index < mid; index++) {
            arr[index] = num;
            num += 2;
        }
        if(n % 2 == 0){
            num -= 1;
        }
        else{
            num-=3;
        }
        for (int index = mid; index < n ; index++) {
            arr[index] = num;
            num -= 2;
        }
    }
}
