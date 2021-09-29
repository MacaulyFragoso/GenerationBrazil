package org.repeticao.laco;

public class Exercicio1 {

	/*
	 * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
	 * obtemos resto = 5. (FOR)
	 * Programa: Exercício 1 Autor: Macauly Fragoso Onde: Fraco da Rocha, SP Quando:
	 * 02/09/2021 Para Generation Brazil
	 */

	public static void main(String[] args) {

		// Declaração de Variaveis: Operador inteiro, variável "n" com valor 1000.
		int n = 1000;

		// Processamento de Dados
		// Processamento de Dados 1: Laço de repetição FOR, onde "n" = 1000, e "n"
		// também será menor que 2000, somando 1.
		for (n = 1000; n < 2000; n++) {

			
			 // Processamento de Dados 2: Estrutura de seleção IF, onde operador lógico %,
			 // divide os números por 11, desde que o resto seja 5
			if (n % 11 == 5) {

				// Saída de Dados
				System.out.println(n);

			}

		}

	}

}