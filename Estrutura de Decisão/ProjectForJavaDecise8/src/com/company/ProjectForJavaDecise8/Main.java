package com.company.ProjectForJavaDecise8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	       double Pro1, Pro2, Pro3;
           Scanner scan = new Scanner(System.in);
           System.out.println("Digite o valor de três produtos:");

           Pro1 = scan.nextDouble();
           Pro2 = scan.nextDouble();
           Pro3 = scan.nextDouble();

           if(Pro1 < Pro2 && Pro1 < Pro3) {
               System.out.println("O primeiro produto é mais barato");
           } else if(Pro2 < Pro1 && Pro2 < Pro3) {
               System.out.println("O segundo produto é mais barato");
           } else if(Pro3 < Pro1 && Pro3 < Pro2) {
               System.out.println("O terceiro produto é mais barato");
           }else {
               System.out.println("Os produtos tem o mesmo valor");
           }
    }
}
