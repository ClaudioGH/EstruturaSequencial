package com.company.ProjectForJavaString4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        String[] palavrasplit = nome.split("");

        for(int i = 0; i <palavrasplit.length;i++) {
            for(int j = 0; j < (i+1);j++) {
                System.out.print(palavrasplit[j]);
            }
            System.out.println();
        }
    }
}
