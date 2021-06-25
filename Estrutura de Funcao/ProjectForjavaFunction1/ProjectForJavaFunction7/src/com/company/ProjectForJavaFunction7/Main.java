package com.company.ProjectForJavaFunction7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int prestacoesDia = 0;
        float[][] arrayFinal = new float[3][10];
        float[] receberArray;
        boolean finalizarDiaB = false;

        System.out.println("Bem vindo a interface de \"Prestação de conta\"");
        do {
            if (prestacoesDia<10) {
                receberArray = Prestacao(prestacoesDia);
                for (int i = 0; i < receberArray.length; i++) {
                    arrayFinal[i][prestacoesDia] = receberArray[i];
                }
            }else{
                System.err.println("Numero prestaçoes diaria exedida");
            }
            prestacoesDia++;

            finalizarDiaB = finalizarDia();
        }while (!finalizarDiaB);

        mostrePrestacao(arrayFinal);

    }

    public static float[] Prestacao(int numeroDaPrestacao) {
        float[] prestacoes = new float[3];
        Scanner Scann = new Scanner(System.in);
        System.out.println("Qual o valor da prestação de conta?");
        float valorPrestacao = Scann.nextFloat();
        System.out.println("Esta prestação esta em atraso? ('S'-Sim, 'N'-Não)");
        char prestacaoEmAtraso = Scann.next().charAt(0);
        int diasEmAtraso = 0;
        if (prestacaoEmAtraso == 's') {
            System.out.println("Quantos dias em atraso?");
            diasEmAtraso = Scann.nextInt();
        } else {
            diasEmAtraso = 0;
        }
        prestacoes[0] = valorPrestacao;
        prestacoes[1] = diasEmAtraso;
        prestacoes[2] = (float) (valorPrestacao + (valorPrestacao * (0.01 * diasEmAtraso)));

        return prestacoes;

    }

    public static boolean finalizarDia(){
        Scanner Scann = new Scanner(System.in);
        System.out.println("'F' - Finalizar o dia\n'A' - Adicionar outra prestação");
        char finalizarDia = Scann.next().charAt(0);
        if (finalizarDia == 'f') {
            return true;
        } else {
            return false;
        }
    }

    public static float[][] mostrePrestacao(float[][] tabelaFinal){
        System.out.println("Fim do dia, segue todas as Prestação de conta\n| Valor da Prestação | Dias em atraso | Valor + juros |");
        for (int i=0; i<10; i++){
            System.out.print("| ");
            for (int j=0; j<3; j++) {
                System.out.print(tabelaFinal[j][i] + " | ");
            }
            System.out.println();
        }
        return null;
    }
}
