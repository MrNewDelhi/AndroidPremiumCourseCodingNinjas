package Milestone2.Test2;

import java.util.Scanner;

public class MinimumLengthWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(minLengthWord(s));
    }
    public static String minLengthWord(String input){
        String[] str = input.split(" ");
        int min = str[0].length();
        int index = 0;
        int minIndex = 0;
        for (String word : str) {
            if(min > word.length()){
                min = word.length();
                minIndex = index;
            }
            index++;
        }
        return str[minIndex];
    }
}
