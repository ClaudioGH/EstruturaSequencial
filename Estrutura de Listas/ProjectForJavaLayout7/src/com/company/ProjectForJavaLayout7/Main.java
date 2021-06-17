package com.company.ProjectForJavaLayout7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numDigit = new int[5];
        float soma = 0;
        float multi = 1;

        for (int i = 0; i < numDigit.length; i++) {
            System.out.println("Digite um numero (" + (i + 1) + ")");
            Scanner scan = new Scanner(System.in);
            numDigit[i] = scan.nextInt();
            soma = soma + numDigit[i];
        }
        for (int i = 0; i < numDigit.length; i++) {
            multi = multi * numDigit[i];
        }
        System.out.println("Soma total dos numeros: " + soma + "\nMultiplicação de todos os numeros: " + multi);

        for (int i = 0; i < numDigit.length; i++) {
            if (i == 4) {
                System.out.print(numDigit[i]);
            } else {
                System.out.print(numDigit[i] + ", ");
            }
        }

    }
}
