package com.company.ProjectForJavaDecise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        number1 = scanner.nextInt();

        System.out.println ("Digite o segundo número");
        number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("O maior  entre eles é: " + number1);

        }else if (number2 > number1) {
            System.out.println("O maior  entre eles é: " + number2);
        }
        else {
            System.out.println("os valores são iguais.");
        }
    }
}
