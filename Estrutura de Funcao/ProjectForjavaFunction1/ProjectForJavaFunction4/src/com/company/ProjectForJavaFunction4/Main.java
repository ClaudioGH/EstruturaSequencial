package com.company.ProjectForJavaFunction4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite um numero:");
        Scanner entrada = new Scanner(System.in);
        float num = entrada.nextFloat();
        NumberPositiveAndNegative(num);
    }

    private static void NumberPositiveAndNegative(float numInformado) {
        if(numInformado > 0){
            System.out.println("O Numero é positivo");
        }else if (numInformado < 0){
            System.out.println("O Numero é Negativo");
        }else {
            System.out.println("Numero = 0");
        }
    }
}
