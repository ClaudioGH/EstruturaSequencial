package com.company.ProjectForJavaFunction3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        float num1 = scan.nextInt();

        System.out.println("Digite o segundo número:");
        float num2 = scan.nextInt();

        System.out.println("Digite o terceiro número:");
        float num3 = scan.nextInt();

        System.out.println(sum(num1, num2, num3));
    }

    static float sum(float num1,float num2,float num3) {

        return(num1 + num2 + num3);

    }
}
