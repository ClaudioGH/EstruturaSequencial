package com.company.ProjectForJava4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   Scanner read = new Scanner(System.in);
	   float number1, number2, number3, number4;
	   float média;

	   System.out.println("type the first number");
       number1 = read.nextFloat();

       System.out.println("type the second number");
       number2 = read.nextFloat();

       System.out.println("type the third number");
       number3 = read.nextFloat();

       System.out.println("type the fourth number");
       number4 = read.nextFloat();

       média = (number1 + number2 + number3 + number4)/4;

       System.out.println("A média final é de" + média);
    }
}
