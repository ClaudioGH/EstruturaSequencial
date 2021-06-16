package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite as letras:");
        char[] letrascan = new char[10];
        char[] letravogal = {'a', 'e', 'i', 'o', 'u'};
        int vogalsum = 0;
        for (int i = 0; i < letrascan.length; i++) {
            Scanner scan = new Scanner(System.in);
            letrascan[i] = scan.next().charAt(0);
        }
        for (int i = 0; i < letrascan.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (letrascan[i] == letravogal[j]) {
                    letrascan[i] = ' ';
                    vogalsum++;
                }
            }
        }
        for (int i = 0; i < letrascan.length; i++) {
            if (letrascan[i] != ' ') {
                if (i == letrascan.length - 1) {
                    System.out.println(letrascan[i] + ".");
                }else {
                    System.out.print(letrascan[i] + ", ");
                }
            }
        }
        System.out.println("Total de consoantes: " + (10 - vogalsum));
    }
}
