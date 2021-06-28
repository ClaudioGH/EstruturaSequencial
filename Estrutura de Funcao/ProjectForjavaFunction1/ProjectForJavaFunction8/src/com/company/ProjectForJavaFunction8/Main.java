package com.company.ProjectForJavaFunction8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        String numInteiro = String.valueOf(Scan.nextInt());
        String[] quantidadeDigitos = numInteiro.split("");
        System.out.println("Quantidade de digitos do número informado: " + quantidadeDigitos.length);
    }
}
