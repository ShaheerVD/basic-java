package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();

        if(number%2 ==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

    }
}