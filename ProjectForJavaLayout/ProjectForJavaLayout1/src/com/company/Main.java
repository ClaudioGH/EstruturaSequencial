package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o valor numero " + (i + 1));
            Scanner scan = new Scanner(System.in);
            numbers[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length-1) {
                System.out.println(numbers[i] + ".");
            }else{
                System.out.print(numbers[i] + ", ");
            }
        }

    }
}

