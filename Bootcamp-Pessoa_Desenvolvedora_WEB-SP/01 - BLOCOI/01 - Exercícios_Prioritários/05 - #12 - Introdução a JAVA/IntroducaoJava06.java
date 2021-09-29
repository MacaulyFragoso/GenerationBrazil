//Package: Organizar Classes Relacionadas:
package org.java.introducao;

	/*Programa: Distancializando.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 6: Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2)
 	   escreva a distância entre eles. A fórmula que efetua tal cálculo é: D = √ (x2 - x1)*2 + (y2 - y1)*2   */

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
			public class IntroducaoJava06{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: Não necessário ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

				//Variável = Tipo de Dado + Declaração, respectivamente:
					double x1, y1, x2, y2, distanciaRaiz, distanciaPotencia;
					
				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
					Scanner leia = new Scanner(System.in);
		
				//Entrada de Dados:
					//Entrada de Dados 1:
						//Entrada de Dados com o Usuário, com Texto em Bloco:
						System.out.println("Para começarmos, digite o  primeiro valor do plano 1: ");
					
						//Para a Leitura dos Dados Inseridos pelo Usuário:
						x1 = leia.nextDouble();
				
					//Entrada de Dados 2:
						System.out.println("Agora, digite o segundo valor do plano 1: ");
						y1 = leia.nextDouble();
				
					//Entrada de Dados 3:
						System.out.println("Digite o  primeiro valor do plano 2: ");
						x2 = leia.nextDouble();
				
					//Entrada de Dados 4:
						System.out.println("E agora, digite o segundo valor do plano 2: ");
						y2 = leia.nextDouble();	

				//Processamento de Dados:
					//Processamento de Dados 1:
						distanciaPotencia = (Double) ((Math.pow ((x2 - x1),2)) + (Math.pow((y2 - y1),2)));
					
					//Processamento de Dados 2:	
						distanciaRaiz = (Double) Math.sqrt(distanciaPotencia);
				
				//Saída de Dados:
					//Saída de Dados com o Usuário, com Texto em Bloco:
						System.out.println("A distancia entre os pontos é: " + distanciaRaiz);
				
		}
				
}