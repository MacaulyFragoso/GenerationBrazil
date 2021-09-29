//Package: Organizar Classes Relacionadas:
package org.java.introducao;

	/*Programa: CalculoExpress.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdu��o aos Algoritmos.
 	 * Exerc�cio 4: Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o:
 	   D=R+S/2, onde R=(A+B)*2 E S=(B+C)*2   */

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos:
			public class IntroducaoJava04{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: N�o necess�rio ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O m�todo n�o est� dando retorno algum); Main: Nome do M�todo; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

				//Vari�vel = Tipo de Dado + Declara��o, respectivamente:
					double numeroA, numeroB, numeroC, numeroR, numeroS, resultado;

				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
					Scanner leia = new Scanner(System.in);
		
				//Entrada de Dados:
					//Utilizando a Classe Scanner, para a Entrada de Dados com o Usu�rio, com Texto em Bloco:
					System.out.println("Para prosseguirmos, digite 3 n�meros inteiros, sendo eles positivos: \n");
					System.out.println("N�mero A: ");
					
					//Para a Leitura dos Dados Inseridos pelo Usu�rio:
					numeroA = leia.nextInt();
				
					System.out.println("N�mero B: ");
					numeroB = leia.nextInt();
				
					System.out.println("N�mero C: ");
					numeroC = leia.nextInt();

				//Processamento de Dados:
					//Processamento de Dados 1:
						numeroR = (Math.pow (numeroA, 2)) + (2 * numeroA * numeroB) + (Math.pow (numeroB, 2));
	     				numeroS = (Math.pow (numeroB, 2)) + (2 * numeroC * numeroB) + (Math.pow (numeroC, 2));

	     			//Processamento de Dados 2:
	     				resultado = (numeroR + numeroS) / 2;

	     		//Sa�da de Dados:
	     			//Sa�da de Dados com o Usu�rio, com Texto em Bloco:
	     			System.out.println("O resultado da express�o �: " + resultado);
				
		}
				
}
	