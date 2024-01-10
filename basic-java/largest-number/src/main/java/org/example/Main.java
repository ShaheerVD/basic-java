package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input num1: ");
        float num1 = input.nextFloat();

        System.out.print("Input num2: ");
        float num2 = input.nextFloat();

        if(num1>num2){
            System.out.println("Number 1 is bigger than number 2");

        }if(num1 == num2){
            System.out.println("The numbers are equal");
        }
        if(num2>num1){
            System.out.println("Number 2 is bigger than number 1");
        }
    }
}