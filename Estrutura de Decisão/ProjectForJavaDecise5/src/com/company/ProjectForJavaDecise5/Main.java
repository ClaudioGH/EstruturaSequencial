package com.company.ProjectForJavaDecise5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double nota1, nota2, media;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        nota1 = scan.nextInt();
        System.out.println("Digite a segunda nota:");
        nota2 = scan.nextInt();
        media = (nota1 + nota2) / 2;

        if (media == 10){
            System.out.println("Aprovado com Distinção!");
        }else if (media < 7){
            System.out.println("Você foi Reprovado!");
        }else if (media >= 7){
            System.out.println("Você foi Aprovado!");
        }
    }
}



