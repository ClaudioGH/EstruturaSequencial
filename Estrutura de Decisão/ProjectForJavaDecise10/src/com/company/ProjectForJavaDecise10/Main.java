package com.company.ProjectForJavaDecise10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Em que turno você estuda? M - Matutino V - Vespertino N - Noturno");
               String turno = scan.next();

        switch (turno) {
            case "M","m": {
                System.out.println("Bom dia!");
            } break;
            case "V","v": {
                System.out.println("Boa tarde!");
            } break;
            case "N","n": {
                System.out.println("Boa noite!");
            } break;

            default:
                System.out.println("Turno Inválido");
        }
    }
}
