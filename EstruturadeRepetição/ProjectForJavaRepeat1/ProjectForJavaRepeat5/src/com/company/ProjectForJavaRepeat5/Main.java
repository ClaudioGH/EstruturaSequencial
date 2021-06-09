package com.company.ProjectForJavaRepeat5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int anos = 0;
        boolean repete = false;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite a populaçao do pais A:");
            float populPo = scan.nextFloat();
            System.out.println("Digite a Taxa de crescimento do Pais A:");
            float taxaPo = scan.nextFloat();

            System.out.println("Digite a populaçao do pais B:");
            float populPp = scan.nextFloat();
            System.out.println("Digite a Taxa de crescimento do Pais B:");
            float taxaPp = scan.nextFloat();


            while (populPo < populPp) {
                anos++;
                populPo += populPo * taxaPo;
                populPp += populPp * taxaPp;
            }
            System.out.println("Quantidade de anos necessarios: " + anos);
            System.out.println("\nDeseja repetir o simulador?\n('S' - Sim eu desejo, 'N' - Não desejo)");
            char repeteChar = scan.next().charAt(0);

            switch (repeteChar) {
                case 's': {
                    repete = true;
                    break;
                }
                case 'n': {
                    repete = false;
                    break;
                }
            }
        } while (repete);
    }
}
