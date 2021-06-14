package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        for (int i=0; i< numbers.length; i++){
            System.out.println("Digite o valor " + (i+1));
            Scanner scan = new Scanner(System.in);
            numbers[i] = scan.nextInt();
        }
        if (numbers[0]<numbers[1]) {
            while (numbers[0] < (numbers[1] - 1)) {
                numbers[0] += 1;
                System.out.println(numbers[0]);
            }
        }else {
            while (numbers[1] < (numbers[0] - 1)) {
                numbers[1] += 1;
                System.out.println(numbers[1]);
            }
        }

    }
}




