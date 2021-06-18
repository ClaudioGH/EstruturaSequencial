package com.company.ProjectForJavaLayout6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float[][] notaAluno = new float[10][4];
        float[] alunoMedia = new float[10];
        int alunoMM = 0;

        for (int i = 0; i < alunoMedia.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.println((j + 1) + " Bimestre: ");
                Scanner scan = new Scanner(System.in);
                notaAluno[i][j] = scan.nextFloat();
            }
        }
        for (int i = 0; i < alunoMedia.length; i++) {
            for (int j = 0; j < 4; j++) {
                alunoMedia[i] = alunoMedia[i] + notaAluno[i][j];
            }
            alunoMedia[i] = (alunoMedia[i] / 4);
        }
        for (int i = 0; i < alunoMedia.length; i++) {
            if (alunoMedia[i] >= 7) {
                alunoMM++;
            }
        }
        System.out.println("Alunos com media maior ou igual a 7: " + alunoMM);
    }
}

