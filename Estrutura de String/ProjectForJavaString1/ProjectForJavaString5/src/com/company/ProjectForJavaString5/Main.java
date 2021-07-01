package com.company.ProjectForJavaString5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = Scan.nextLine();

        String[] palavraSplit = palavra.toUpperCase().split("");

        for (int i=palavraSplit.length; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print(palavraSplit[j]);
            }
            System.out.println();
        }

    }
}
