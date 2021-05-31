package com.company.ProjectForJava10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite a temperatura em graus Celsius:");
        Scanner Scan = new Scanner(System.in);
        float tempCelsius = Scan.nextFloat();
        float tempFahren = (tempCelsius * 9/5) + 32;
        System.out.println("A Temperatura em Fahrenheit é: " + tempFahren);
    }
}
