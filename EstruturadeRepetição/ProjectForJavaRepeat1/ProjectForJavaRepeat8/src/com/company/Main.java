package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float[] number = new float[5];
        float numberSum = 0;
        for (int i = 0; i < number.length; i++) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Digite o valor numero " + (i + 1));
            number[i] = myObj.nextFloat();
        }

        for (int i = 0; i < 5; i++) {
            numberSum = numberSum + number[i];
        }

        float numberMedia = numberSum / 5;

        System.out.println("A soma de todos os numeros é: " + numberSum);
        System.out.println("A média de todos os numeros é: " + numberMedia);

    }
}
