package com.company.ProjectForJavaDecise4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           System.out.println("Digite uma letra:");

           String letra = scan.next();

           switch (letra) {
               case "a", "A":
               case "e", "E":
               case "i", "I":
               case "o", "O":
               case "u", "U":
                    System.out.println("A letra " + letra  + " É uma vogal");
                    break;
               default:
                    System.out.println("A letra " + letra  + " É uma consoante");

           }
    }
}
