package com.nunespc;

import java.util.Arrays;
import java.util.Scanner;

public class Projeto2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe a quantidade de aluno: ");
		int qtdAluno = entrada.nextInt();
		
		System.out.printf("Informe a quantidade de nota: ");
		int qtdNota = entrada.nextInt();
		
		double [][] notaDaTurma = new double[qtdAluno][qtdNota];
		
		double total = 0;
		
		for(int a=0; a<notaDaTurma.length; a++) {
			for (int n=0; n<notaDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %dª do %dº aluno: ", n + 1, a + 1);
					notaDaTurma[a][n] = entrada.nextDouble();
					total += notaDaTurma[a][n];
				}
			
		}
		
		double media = total / (qtdAluno * qtdNota);
		System.out.println("Média da turma é "+media+"!");
		
		for (double [] nota: notaDaTurma) {
			System.out.println(Arrays.toString(nota));
		}
		entrada.close();
	}

}
