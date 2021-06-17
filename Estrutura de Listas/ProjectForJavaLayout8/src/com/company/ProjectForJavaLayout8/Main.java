package com.company.ProjectForJavaLayout8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float[][] idadeAltura = new float[5][2];

        for (int i = 0; i < 5; i++) {
            System.out.println("Pessoa " + (i + 1) + "\nIdade: ");
            Scanner scan = new Scanner(System.in);
            idadeAltura[i][0] = scan.nextFloat();
            System.out.println("Altura: ");
            idadeAltura[i][1] = scan.nextFloat();
        }
        for (int i = 4; i > -1; i--) {
            System.out.println("Pessoa " + (i + 1) + "\nIdade: " + idadeAltura[i][0] + " | Altura: " + idadeAltura[i][1]);
        }
    }
}

