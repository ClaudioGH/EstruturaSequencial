package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int parP = -1;
        int imparP = -1;
        int[] allNumber = new int[20];
        int[] numPar = new int[20];
        int[] numImpar = new int[20];
        boolean numberVB = false;

        for (int i = 0; i < allNumber.length; i++) {
            System.out.print("Selecione os valores no Vetor: ");
            Scanner scan = new Scanner(System.in);
            allNumber[i] = scan.nextInt();
        }
        for (int i = 0; i < allNumber.length; i++) {

            int numberV = allNumber[i];

            numberVB = true;

            while (numberVB) {
                if (numberV == 0) {
                    parP++;
                    numPar[parP] = allNumber[i];
                    numberVB= false;
                    break;
                } else if (numberV == 1) {
                    imparP++;
                    numImpar[imparP] = allNumber[i];
                    numberVB = false;
                    break;
                } else {
                    numberV = numberV - 2;
                }
            }
        }
        System.out.print("Numeros Digitados: ");
        for (int i = 0; i < allNumber.length; i++) {
            if (i == allNumber.length-1){
                System.out.print(allNumber[i] + ".");
            }else{
                System.out.print(allNumber[i] + ", ");
            }
        }
        System.out.print("\nNumeros Pares digitados: ");
        for (int i = 0; i < numPar.length; i++) {
            if (numPar[i] != 0) {
                System.out.print(numPar[i] + ", ");
                if (i == numPar.length-1){
                    System.out.print(numPar[i] + ".");
                }else{
                    System.out.print(numPar[i] + ", ");
                }
            }
        }
        System.out.print("\nNumeros Impar digitados: ");
        for (int i = 0; i < numImpar.length; i++) {
            if (numImpar[i] != 0) {
                System.out.print(numImpar[i] + ", ");
                if (i == numImpar.length-1){
                    System.out.print(numImpar[i] + ".");
                } else {
                    System.out.print(numImpar[i] + ", ");
                }
            }
        }
        System.out.println();

    }
}

