//Package: Organizar Classes Relacionadas:
package org.matrizez.vetores;

import java.util.Scanner;

/*Programa: PointStation.
 	 * Autor: Macauly Fragoso.
	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
	 * BLOCO I.
	 * #10 - Vetores e Matrizes.
	 * Exercício 2: Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva
	   esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior
	   pontuação.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		public class VetoresMatrizes02 {

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
			public class VetoresMatrizes01 {

			 //Public: Modificador de Acesso, que permite qualquer outra classe acessar;
			 //Static: Não necessário ser instanciada (Definida pela Classe);
			 //Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando
			 //retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args) {
			
				//Variável = Tipo de Dado + Declaração + Valor, respectivamente:
					int [] dado = new int[10];
					int lancamentoDado = 10, soma = 0, maiorValor = 0, x = 0, contador = 0;	
					double media = 0.00;
					
				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
					Scanner leia = new Scanner(System.in);
					
				//Processamento de Dados:
					//Processamento de Dados 1:
						for(x=0; x <lancamentoDado; x++){

				//Entrada de Dados:
					//Entrada de Dados com o Usuário, com Texto em Bloco:
							System.out.println("Digite aqui o " + x+1 + " resultado de lançamento do Dado: ");
					//Para a Leitura dos Dados Inseridos pelo Usuário:					
					(dado[x]) = leia.nextInt();
					
						soma = soma + dado[x];
						media = soma / lancamentoDado;

					//Processamento de Dados 2:
						if(dado[x] >= maiorValor){

					//Processamento de Dados 3:
						if(dado[x] == maiorValor){
						contador++;}

					//Processamento de Dados 4:
						else{
							contador=1;}
						
						maiorValor = dado[x];
						}
					
						};

					//Processamento de Dados 5:
						for(x=0; x <lancamentoDado; x++){

				//Saída de Dados:
					//Saída de Dados 1:
						//Saída de Dados com o Usuário, com Texto em Bloco:
							System.out.println(x+1 + "º Resultado: " + dado[x] + "\n");}

					//Saída de Dados 2:
						//Saída de Dados com o Usuário, com Texto em Bloco:
						System.out.println("\nA média dos resultados apresentados foi de: " + media);
						System.out.println("\nO maior resultado foi: " + maiorValor + ", ocorrendo por " + contador + " vezes.\n");
			}
}
		}