package com.company.ProjectForJavaFunction6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite a hora:");
        Scanner scan = new Scanner(System.in);
        float hora = 0;
        String horadigito = scan.next();
        String horarray[] = horadigito.split(":");
        int[] horadigitarrayint = new int[horarray.length];

        for(int i = 0; i < horadigitarrayint.length; i++) {
            horadigitarrayint[i] = Integer.parseInt(horarray[i]);
        }
        for(int resultado : horadigitarrayint) {
            System.out.println(resultado);
        }
        float ConversaoamPpm = 0;
    }
}
