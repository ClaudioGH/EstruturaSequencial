package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o valor da casa numero " + (i + 1));
            Scanner myObj = new Scanner(System.in);
            numbers[i] = myObj.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i] + ".");
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
    }
}

