package com.company.ProjectForJavaRepeat3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float populPo = 80000F;
        float populPp = 200000F;
        int anos = 0;

        while (populPo < populPp) {
            anos++;
            populPo += populPo * 0.03F;
            populPp += populPp * 0.015F;
        }
        System.out.println("Quantidade de anos necessarios seriam: " + anos);
    }
}
