package com.nunespc;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		int combustivel, stop=1;
		int soma1=0, soma2=0, soma3=0;

		
		while (stop != 2){
			if (stop == 1){
			  System.out.println("Informe o Combutivel");
			  System.out.println("1 - Álcool");
			  System.out.println("2 - Gasolina");
			  System.out.println("3 - Diesel");
			  System.out.println("4 - Fim");
				combustivel = sc.nextInt();
				if (combustivel == 1){
					soma1 = soma1 + 1;
				}
				else if (combustivel == 2){
				  soma2 = soma2 + 1;
				}
				else if (combustivel == 3){
					soma3 = soma3 + 1;
				}
				else if (combustivel == 4){
				  stop = 0;
				  System.out.println("Fim");
				  
				}
				else {
					System.out.println("Codigo invalido, por favor digite (1)-Álcool, (2)-Gasolina, (3)-Disel ou (4)-Fim");
				}
			}
			if (stop == 1){
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Alcool: %d\n",soma1);
				System.out.printf("Gasolina: %d\n",soma2);
				System.out.printf("Diesel: %d\n",soma3);
			}
		}
		sc.close();
	}

}