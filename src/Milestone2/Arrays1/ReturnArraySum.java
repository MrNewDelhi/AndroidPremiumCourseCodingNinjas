package Milestone2.Arrays1;

import java.util.Scanner;

public class ReturnArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases > 0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int index = 0; index < size; index++){
                arr[index] = sc.nextInt();
            }
            System.out.println(sum(arr));
            testcases--;
        }
    }
    public static int sum(int[] arr){
        int add = 0;
        for (int element :
                arr) {
            add+=element;
        }
        return add;
    }
}
