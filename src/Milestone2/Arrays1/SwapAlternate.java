package Milestone2.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class SwapAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases > 0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int index = 0; index < size; index++){
                arr[index] = sc.nextInt();
            }
            alt(arr);
                System.out.print(Arrays.toString(arr));
            testcases--;
        }
    }
    public static void alt(int[] arr){
        for(int current = 0; current < arr.length-1; current+=2){
            int next = current+1;
            int temp = arr[current];
            arr[current] = arr[next];
            arr[next] = temp;
        }
    }
}
