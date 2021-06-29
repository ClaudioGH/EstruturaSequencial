package com.company.ProjectForJavaString2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu nome(pode ser maiusculo ou minusculo)");
        String nome = scan.nextLine();


        System.out.println(new StringBuilder(nome.toUpperCase()).reverse());
    }
}
