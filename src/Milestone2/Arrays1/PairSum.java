package Milestone2.Arrays1;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases > 0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int index = 0; index < size; index++){
                arr[index] = sc.nextInt();
            }
            int sum = sc.nextInt();
            int count = 0;
            for(int index_i = 0; index_i < size-1; index_i++){
                for(int index_j = index_i + 1; index_j < size; index_j++){
                    if(arr[index_i] + arr[index_j] == sum){
                        count++;
                    }
                }
            }
            System.out.println(count);
            testcases--;
        }
    }

}
