package Milestone2.Arrays1;

import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases > 0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i = 0; i < size; i++){
                arr[i] = sc.nextInt();
            }
            int sum = sc.nextInt();
            System.out.println(findTriplet(arr, sum));
            testcases--;
        }
    }
    public static int findTriplet(int[] arr, int x){
        int size = arr.length;
        int count = 0;
        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                for(int k = j + 1; k < size; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
