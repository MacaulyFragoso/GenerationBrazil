//Package: Organizar Classes Relacionadas:
package org.matrizez.vetores;

	/*Programa: PointStation.
	 * Autor: Macauly Fragoso.
	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
	 * BLOCO I.
	 * #10 - Vetores e Matrizes.
	 * Exerc�cio 1: Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. Encontre
	   ap�s a maior pontua��o e a apresente.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos:
			public class VetoresMatrizes01 {

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar;
			//Static: N�o necess�rio ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O m�todo n�o est� dando
			//retorno algum); Main: Nome do M�todo; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args) {
				
			//Vari�vel = Tipo de Dado + Declara��o + Valor, respectivamente:
				double [] pontuacao = new double[5];
				double maiorPontuacao = 0.0;
				int valores = 5;
				
			//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
				Scanner leia = new Scanner(System.in);

			//Processamento de Dados:
				//Processamento de Dados 1:
					//La�o de Repti��o PARA: Aqui est� sendo usado para fazer a quantidade de Loopings poss�veis, menor que o valor de "Valores".
					//++ Est� sendo usado aqui para exibir "x" mais 1 vez, � cada giro.
					for(int x=0; x < valores; x++){
				
			//Entrada de Dados:
				//Entrada de Dados com o Usu�rio, com Texto em Bloco:
					System.out.println("Entre com os n�meros que vierem a sua mente, e olha como eu sei qual ser� o maior...: ");
					//Para a Leitura dos Dados Inseridos pelo Usu�rio:
					(pontuacao[x]) = leia.nextDouble();
					
				//Processamento de Dados 2:
					if(pontuacao[x] > maiorPontuacao){
						maiorPontuacao = pontuacao[x];
					}
			
					}

				//Processamento de Dados 3:
					for(int x=0; x < valores; x++){
				
			//Sa�da de Dados:
					//Entrada de Dados com o Usu�rio, com Texto em Bloco:
					System.out.println("Valor da pontua��o " + x+1 + ": " + pontuacao[x] + "\n");
					}
			
			//Sa�da de Dados:
					//Sa�da de Dados com o Usu�rio, com Texto em Bloco:
					System.out.println("\nA maior pontua��o �: " + maiorPontuacao);
					
				}
				
}