package com.company.ProjectForJava2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Olá Mundo" );

    System.out.println(" Digite um número ");
        Scanner scanner = new Scanner(System.in);
        String Number = scanner.nextLine();

        System.out.println("O número que digitou foi:" + Number);
    }
}
