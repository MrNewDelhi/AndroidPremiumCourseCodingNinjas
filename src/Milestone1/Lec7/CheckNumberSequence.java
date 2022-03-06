package Milestone1.Lec7;

import java.util.Scanner;

public class CheckNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean isInc = false;
        for(int i = 0; i < size-1; i++){
            int curr = sc.nextInt();
            int next = sc.nextInt();
            if(curr < next){
                if(isInc){
                    
                }
            }
            else if(curr > next){
            }
            else {
                break;
            }
        }
    }
}

