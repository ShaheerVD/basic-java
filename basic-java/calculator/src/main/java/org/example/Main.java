package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Number 1: ");
        float num1 = input.nextFloat();

        System.out.println("Input Number 2: ");
        float num2 = input.nextFloat();

        System.out.println("Input Operator(+, -, *, /) : ");
        String operator = input.next();

        if (operator.equals("+")){
            System.out.println(num1+num2);
        }
        if (operator.equals("-")){
           if(num2>num1){
               System.out.println(num2-num1);
           }else{
               System.out.println(num1-num2);
           }
        }
        if (operator.equals("*")){
            System.out.println(num1*num2);
        }
        if (operator.equals("/")){
            if (num1>num2){
                System.out.println(num1/num2);
            }else{
                System.out.println(num2/num1);
            }
        }
    }
}