package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float[] notas = new float[4];
        float notasM = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota do " + (i + 1) + " bimestre");
            notas[i] = scan.nextFloat();
            notasM += notas[i];
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota do bimestre" + (i + 1) + ": " + notas[i]);
        }
        System.out.println("Media das notas: " + (notasM / notas.length));
    }
}

