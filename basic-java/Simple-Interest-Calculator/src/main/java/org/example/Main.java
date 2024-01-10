package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Principal: ");
        float p = input.nextFloat();

        System.out.println("Input Time: ");
        int t = input.nextInt();

        System.out.println("Input Rate: ");
        float r = input.nextFloat();

        float simpleInterest = (p*r*t)/100;
        System.out.println("Simple Interest is: "+ simpleInterest);
    }
}