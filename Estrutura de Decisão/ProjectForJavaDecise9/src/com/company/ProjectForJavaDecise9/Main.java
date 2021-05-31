package com.company.ProjectForJavaDecise9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     double num1, num2, num3;
	     Scanner scan = new Scanner(System.in);
	     System.out.println("Digite o primeiro número:");
	     num1 = scan.nextDouble();

	     System.out.println("Digite o segundo número:");
	     num2 = scan.nextDouble();

	     System.out.println("Digite o terceiro número:");
	     num3 = scan.nextDouble();

	     if(num1 > num2 && num1 > num3) {
             System.out.println(num1 + " " + num2 + " " + num3);
         } else if (num2 > num1 && num2 > num3) {
             System.out.println(num2 + " " + num1 + " " + num3);
         } else if (num3 > num1 && num3 > num2) {
	         System.out.println(num3 + " " + num1 + " " + num2);
         }else if (num1 > num3 && num3 > num2){
             System.out.println(num1 + " " + num3 + " " + num2);
         }else if (num2 > num3 && num3 > num1){
             System.out.println(num2 + " " + num3 + " " + num1);
         }else{
             System.out.println("os números são iguais");
         }

    }
}
