package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //calculate fibonacci series up to n numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'n' : ");
        int n = input.nextInt();
        int f1=0,f2=1,f3;
        System.out.println(f1+" "+f2+" ");
        for(int i=2;i<n;i++){
            f3=f1+f2;
            System.out.println(f3+" ");
            f1=f2;
            f2=f3;

        }

    }
}