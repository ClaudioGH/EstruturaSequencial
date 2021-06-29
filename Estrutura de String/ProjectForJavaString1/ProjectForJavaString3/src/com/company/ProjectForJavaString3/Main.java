package com.company.ProjectForJavaString3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();


        String[] palavraSplit = nome.toUpperCase().split("");

        for(String nome2 : palavraSplit) {
            System.out.println(nome2);
        }
    }
}
