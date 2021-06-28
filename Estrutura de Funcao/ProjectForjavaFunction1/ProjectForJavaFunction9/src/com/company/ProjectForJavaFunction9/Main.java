package com.company.ProjectForJavaFunction9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        String numInteiro = String.valueOf(scan.nextInt());
        String[] digitosseparados = numInteiro.split("");
        for (int i = (digitosseparados.length-1); i>=0; i--) {
            System.out.print(digitosseparados[i]);
        }
    }
}
