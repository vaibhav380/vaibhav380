package com._03_Conditions_loops;

import java.util.Scanner;

public class Is_primeNumbers_Not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num<=1){
            System.out.println("Neither prime nor composite");
        }
        else{
            for(int i = 2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    System.out.println("Not Prime");
                    break;
                }
                else{
                    System.out.println("Prime");
                }
            }
        }
    }
}
