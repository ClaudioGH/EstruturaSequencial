package com.company.ProjectForJavaLayout9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numberAll = new int[10];
        int sumQ = 0;
        for (int i=0; i<numberAll.length; i++) {
            System.out.println("Digite um numero (" + (i+1) + ")");
            Scanner scan = new Scanner(System.in);
            numberAll[i] = scan.nextInt();
            sumQ += (numberAll[i] = numberAll[i]);
        }
        System.out.println("Soma total:" + sumQ);
        
    }
}
