package com.company.ProjectForJavaRepeat1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     int nota = 100;
	     while (nota < 0 || nota > 10) {
             System.out.println("Digite sua nota:");
             Scanner scan = new Scanner(System.in);
             nota = scan.nextInt();
             if (nota < 0 || nota > 10) {
                 System.out.println("Nota inválida!");
             } else {
                 System.out.println("Sua nota é:" + nota);
             }
         }

    }
}
