package com.company.ProjectForJavaRepeat2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     String usuario;
	     String senha;
	     do {
             System.out.println("Digite seu usuário:");
             Scanner scan = new Scanner(System.in);
             usuario = scan.nextLine();
             System.out.println("Digite sua senha:");
             senha = scan.nextLine();
             if (usuario.equals(senha)) {
                 System.out.println("Usuário e senha inválidos!");
             }

         } while (usuario.equals(senha));
                 System.out.println("Seu usuário e senha estão corretos");
    }
}
