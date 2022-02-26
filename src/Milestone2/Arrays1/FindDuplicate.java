package Milestone2.Arrays1;

import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int index = 0; index < size; index++) {
                arr[index] = sc.nextInt();
            }
            System.out.println(findDuplicate(arr));
            testcases--;
        }
    }
    public static int findDuplicate(int[] arr){
        int num = -1;
        for(int index_i = 0; index_i < arr.length; index_i++){
            for(int index_j = index_i + 1; index_j < arr.length; index_j++){
                if(arr[index_i] == arr[index_j]){
                    num = arr[index_i];
                    return num;
                }
            }
        }
        return num;
    }
}
