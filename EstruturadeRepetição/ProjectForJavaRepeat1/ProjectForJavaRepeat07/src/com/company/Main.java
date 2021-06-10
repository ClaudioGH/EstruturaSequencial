package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float[][] number = new float[5][2];
        for (int i = 0; i < number.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o valor numero " + (i + 1));
            number[i][0] = scan.nextFloat();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                number[i][1] = number[i][0] > number[j][0] ? number[i][1] + 1 : number[i][1];
            }
        }
        for (int i = 0; i < 5; i++) {
            if (number[i][1] == 4) {
                System.out.println("Maior numero é o: " + (i+1) + ", equivale: " + number[i][0]);
            }
        }

    }
}