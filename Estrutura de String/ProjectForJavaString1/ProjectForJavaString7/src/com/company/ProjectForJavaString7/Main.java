package com.company.ProjectForJavaString7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String fraseDigitada = Scan.nextLine();
        String[] frasesplit = fraseDigitada.split("");

        int vogais = 0,
                emBranco = 0;

        String[] letrasVogais = {"a", "e", "i", "o", "u"};
        for (int i=0; i< frasesplit.length; i++){
            if (frasesplit[i].equalsIgnoreCase(" ")){
                emBranco++;
            }
            for (int j=0; j<letrasVogais.length; j++){
                if (frasesplit[i].equalsIgnoreCase( letrasVogais[j])){
                    vogais++;
                }
            }
        }
        System.out.printf("Espaços em branco na frase: %d vezes%n", emBranco);
        System.out.printf("vogais na frase: %d", vogais);
    }
}

