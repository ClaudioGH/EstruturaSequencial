package com.company.ProjectForJavaDecise7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double number1, number2, number3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        number1 = scan.nextDouble();

        System.out.println("Digite o segundo número:");
        number2 = scan.nextDouble();

        System.out.println("Digite o terceiro número:");
        number3 = scan.nextDouble();

        if(number1 > number2 && number1 > number3){
            System.out.println("O número " + number1 + " é o maior");
        }else if (number2 > number1 && number2 >number3){
            System.out.println("O número " + number2 + " é o maior");
        }else if(number3 > number1 && number3 > number2){
            System.out.println("O número " + number3 + " é o maior");
        }else {
            System.out.println("Os números são iguais");
        }
        if(number1 < number2 && number1 < number3){
            System.out.println("O número " + number1 + " é o menor");
        }else if (number2 < number1 && number2 < number3){
            System.out.println("O número " + number2 + " é o menor");
        }else if(number3 < number1 && number3 < number2){
            System.out.println("O número " + number3 + " é o menor");
        }

    }
}

