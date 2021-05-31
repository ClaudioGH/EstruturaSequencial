package com.company.ProjectForJava9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite a temperatura em Fahrenheit:");
        Scanner scan = new Scanner(System.in);
        float tempFahren = scan.nextFloat();
        float tempCelsius = 5 * ((tempFahren - 32) / 9);
        System.out.println("Sua temperatura em Celsius é: " + tempCelsius);
    }
}
