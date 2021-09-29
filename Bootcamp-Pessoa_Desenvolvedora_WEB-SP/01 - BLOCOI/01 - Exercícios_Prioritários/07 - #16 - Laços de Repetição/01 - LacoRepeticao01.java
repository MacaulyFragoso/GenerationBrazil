package org.repeticao.laco;

public class Exercicio1 {

	/*
	 * 1- Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
	 * obtemos resto = 5. (FOR)
	 * Programa: Exerc�cio 1 Autor: Macauly Fragoso Onde: Fraco da Rocha, SP Quando:
	 * 02/09/2021 Para Generation Brazil
	 */

	public static void main(String[] args) {

		// Declara��o de Variaveis: Operador inteiro, vari�vel "n" com valor 1000.
		int n = 1000;

		// Processamento de Dados
		// Processamento de Dados 1: La�o de repeti��o FOR, onde "n" = 1000, e "n"
		// tamb�m ser� menor que 2000, somando 1.
		for (n = 1000; n < 2000; n++) {

			
			 // Processamento de Dados 2: Estrutura de sele��o IF, onde operador l�gico %,
			 // divide os n�meros por 11, desde que o resto seja 5
			if (n % 11 == 5) {

				// Sa�da de Dados
				System.out.println(n);

			}

		}

	}

}