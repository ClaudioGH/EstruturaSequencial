package com.company.ProjectForJavaString1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a primeira palavra:");
        String palavra1;
        palavra1 = scan.next();
        System.out.println("Informe a segunda palavra:");
        String palavra2;
        palavra2 = scan.next();

        if(palavra1.length() == palavra2.length()) {
            System.out.println("As duas palavras tem a mesma quantidade de caracteres");
        }
        if(palavra1.length() != palavra2.length()) {
            System.out.println("As duas palavras não tem a mesma quantidade de caracteres");
        }

        System.out.println("A palavra " +palavra1+ " possui " +palavra1.length()+ " caracteres");
        System.out.println("A palavra " + palavra2 + " possui " +palavra2.length()+ " caracteres");
    }

}

