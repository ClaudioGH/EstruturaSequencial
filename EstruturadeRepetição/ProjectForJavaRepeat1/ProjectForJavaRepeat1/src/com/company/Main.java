package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean NumNota = false;
        while (!NumNota) {
            System.out.println("Digite uma nota de 0 a 10:");
            Scanner scan = new Scanner(System.in);
            int numwritt = scan.nextInt();

            if (numwritt <= 10 && numwritt >= 0) {
                System.out.println("Sua nota é valida");
                NumNota = true;
            } else {
                System.out.println("Sua nota não é valida!");
            }
        }
    }
}