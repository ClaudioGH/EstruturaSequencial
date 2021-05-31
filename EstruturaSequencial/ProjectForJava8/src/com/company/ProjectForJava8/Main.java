package com.company.ProjectForJava8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            int htm;
            int dph, resultado;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o quanto você ganha por hora");
            dph = scanner.nextInt();
            System.out.println("Digite quantas horas você trabalhou:");
            htm = scanner.nextInt();
            resultado = dph*htm;
            System.out.println("Total que você receberá no mês é de:" + resultado);
    }
}
