package com.company.ProjectForJava07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	   int lado;
		   double área;

	       Scanner scanner = new Scanner(System.in);
	       System.out.println("Digite o valor do lado:");
	       lado = scanner.nextInt();
	       área = (lado*lado);
	       System.out.println("A área do quadrado é:" + área);
    }
}
