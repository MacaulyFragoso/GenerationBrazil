//Package: Organizar Classes Relacionadas:
package org.matrizez.vetores;

	/*Programa: PointStation.
	 * Autor: Macauly Fragoso.
	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
	 * BLOCO I.
	 * #10 - Vetores e Matrizes.
	 * Exercício 1: Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. Encontre
	   após a maior pontuação e a apresente.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
			public class VetoresMatrizes01 {

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar;
			//Static: Não necessário ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando
			//retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args) {
				
			//Variável = Tipo de Dado + Declaração + Valor, respectivamente:
				double [] pontuacao = new double[5];
				double maiorPontuacao = 0.0;
				int valores = 5;
				
			//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
				Scanner leia = new Scanner(System.in);

			//Processamento de Dados:
				//Processamento de Dados 1:
					//Laço de Reptição PARA: Aqui está sendo usado para fazer a quantidade de Loopings possíveis, menor que o valor de "Valores".
					//++ Está sendo usado aqui para exibir "x" mais 1 vez, á cada giro.
					for(int x=0; x < valores; x++){
				
			//Entrada de Dados:
				//Entrada de Dados com o Usuário, com Texto em Bloco:
					System.out.println("Entre com os números que vierem a sua mente, e olha como eu sei qual será o maior...: ");
					//Para a Leitura dos Dados Inseridos pelo Usuário:
					(pontuacao[x]) = leia.nextDouble();
					
				//Processamento de Dados 2:
					if(pontuacao[x] > maiorPontuacao){
						maiorPontuacao = pontuacao[x];
					}
			
					}

				//Processamento de Dados 3:
					for(int x=0; x < valores; x++){
				
			//Saída de Dados:
					//Entrada de Dados com o Usuário, com Texto em Bloco:
					System.out.println("Valor da pontuação " + x+1 + ": " + pontuacao[x] + "\n");
					}
			
			//Saída de Dados:
					//Saída de Dados com o Usuário, com Texto em Bloco:
					System.out.println("\nA maior pontuação é: " + maiorPontuacao);
					
				}
				
}