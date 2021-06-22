package com.company.ProjectForJavaFunction1;

import java.util.Scanner;

public class Exercicio1 {

    public static void repeticao(int numrepeat) {
        for(int i = 0;i <numrepeat;i++) {
            for(int j = 0;j < (i+1); j++) {
                System.out.print((i+1) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero de repetições");
        int numrepeat = entrada.nextInt();
        repeticao(numrepeat);
    }
}