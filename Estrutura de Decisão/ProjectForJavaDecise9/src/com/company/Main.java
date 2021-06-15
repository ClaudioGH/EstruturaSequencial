package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numa;
        int numb;
        int numc;

        System.out.println("Digite o primeiro numero:");
        numa = scan.nextInt();

        System.out.println("Digite o segundo numero:");
        numb = scan.nextInt();

        System.out.println("Digite o terceiro numero:");
        numc = scan.nextInt();

        if (numa > numb) {
            if (numb > numc) {
                System.out.println(numa + "\n" + numb + "\n" + numc);
            } else if (numa > numc) {
                System.out.println(numa + "\n" + numc + "\n" + numb);
            } else {
                System.out.println(numc + "\n" + numa + "\n" + numb);
            }
        } else if (numb > numc) {
            if (numa > numc) {
                System.out.println(numb + "\n" + numa + "\n" + numc);
            } else {
                System.out.println(numb + "\n" + numc + "\n" + numa);
            }
        } else {
            System.out.println(numc + "\n" + numb + "\n" + numa);
        }

    }
}