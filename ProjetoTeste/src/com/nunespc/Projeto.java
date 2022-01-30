package com.nunespc;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Esse projeto foi utilizado Array, Foreach e estrutura de controle(IF, ElSE IF E ELSE) 
 * 
 */

public class Projeto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade de notas ");
		int numNota = entrada.nextInt();
		System.out.println(numNota);
		
		double [] notasAluno = new double[numNota];
		
		
		for(int i = 0; i<notasAluno.length; i++) {
			System.out.println("Informe a nota " + (i + 1) + "ª: ");
			notasAluno[i] = entrada.nextDouble();
		}

		double total = 0;
		for(double nota: notasAluno) {
			total += nota;
		}
		double media = total / notasAluno.length;
		//System.out.println("média é " + media +"!");
		entrada.close();
		
		if(media >= 7) {
			System.out.println("A média do aluno é "+ media +" e foi aprovado");
		}else if(media < 7 && media >= 6) {
			System.out.println("A média do aluno é "+ media +" e está em reculperação");
		}else {
			System.out.println("A média do aluno é "+ media +" e foi reprovado");
		}
	}

}
 