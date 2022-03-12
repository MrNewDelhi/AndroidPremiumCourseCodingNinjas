package Milestone2.Arrays1;

import java.util.Scanner;

public class Sort0or1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            sortZeroesAndOne(arr);

            for (int element : arr) {
                System.out.print(element + " ");
            }

            testcases--;
        }
    }
    public static void sortZeroesAndOne(int[] arr){
        int nextZero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero+=1;
            }
        }
    }
}
