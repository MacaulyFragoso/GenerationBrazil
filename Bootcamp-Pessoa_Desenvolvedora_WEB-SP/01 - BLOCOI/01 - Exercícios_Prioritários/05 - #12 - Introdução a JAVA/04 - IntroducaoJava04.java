//Package: Organizar Classes Relacionadas:
package org.java.introducao;

	/*Programa: CalculoExpress.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 4: Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
 	   D=R+S/2, onde R=(A+B)*2 E S=(B+C)*2   */

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
			public class IntroducaoJava04{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: Não necessário ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

				//Variável = Tipo de Dado + Declaração, respectivamente:
					double numeroA, numeroB, numeroC, numeroR, numeroS, resultado;

				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
					Scanner leia = new Scanner(System.in);
		
				//Entrada de Dados:
					//Utilizando a Classe Scanner, para a Entrada de Dados com o Usuário, com Texto em Bloco:
					System.out.println("Para prosseguirmos, digite 3 números inteiros, sendo eles positivos: \n");
					System.out.println("Número A: ");
					
					//Para a Leitura dos Dados Inseridos pelo Usuário:
					numeroA = leia.nextInt();
				
					System.out.println("Número B: ");
					numeroB = leia.nextInt();
				
					System.out.println("Número C: ");
					numeroC = leia.nextInt();

				//Processamento de Dados:
					//Processamento de Dados 1:
						numeroR = (Math.pow (numeroA, 2)) + (2 * numeroA * numeroB) + (Math.pow (numeroB, 2));
	     				numeroS = (Math.pow (numeroB, 2)) + (2 * numeroC * numeroB) + (Math.pow (numeroC, 2));

	     			//Processamento de Dados 2:
	     				resultado = (numeroR + numeroS) / 2;

	     		//Saída de Dados:
	     			//Saída de Dados com o Usuário, com Texto em Bloco:
	     			System.out.println("O resultado da expressão é: " + resultado);
				
		}
				
}
	