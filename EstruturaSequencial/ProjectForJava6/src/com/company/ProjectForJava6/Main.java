package com.company.ProjectForJava6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double pi = 3.14;
              double raio, área;

              Scanner scanner = new Scanner(System.in);
              System.out.println("Qual o raio do círculo");
              raio = scanner.nextInt();
              área = pi*(raio*raio);
              System.out.println("A área do círculo é: " + área);









    }
}
