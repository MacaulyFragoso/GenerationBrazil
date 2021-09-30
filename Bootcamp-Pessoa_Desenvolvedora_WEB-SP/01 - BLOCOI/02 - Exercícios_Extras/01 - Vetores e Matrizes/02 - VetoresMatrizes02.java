//Package: Organizar Classes Relacionadas:
package org.matrizez.vetores;

import java.util.Scanner;

/*Programa: PointStation.
 	 * Autor: Macauly Fragoso.
	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
	 * BLOCO I.
	 * #10 - Vetores e Matrizes.
	 * Exerc�cio 2: Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos, escreva
	   esse vetor. A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior
	   pontua��o.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		public class VetoresMatrizes02 {

		//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos:
			public class VetoresMatrizes01 {

			 //Public: Modificador de Acesso, que permite qualquer outra classe acessar;
			 //Static: N�o necess�rio ser instanciada (Definida pela Classe);
			 //Void: Um tipo de Retorno de Dado, esse sem Valor (O m�todo n�o est� dando
			 //retorno algum); Main: Nome do M�todo; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args) {
			
				//Vari�vel = Tipo de Dado + Declara��o + Valor, respectivamente:
					int [] dado = new int[10];
					int lancamentoDado = 10, soma = 0, maiorValor = 0, x = 0, contador = 0;	
					double media = 0.00;
					
				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
					Scanner leia = new Scanner(System.in);
					
				//Processamento de Dados:
					//Processamento de Dados 1:
						for(x=0; x <lancamentoDado; x++){

				//Entrada de Dados:
					//Entrada de Dados com o Usu�rio, com Texto em Bloco:
							System.out.println("Digite aqui o " + x+1 + " resultado de lan�amento do Dado: ");
					//Para a Leitura dos Dados Inseridos pelo Usu�rio:					
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

				//Sa�da de Dados:
					//Sa�da de Dados 1:
						//Sa�da de Dados com o Usu�rio, com Texto em Bloco:
							System.out.println(x+1 + "� Resultado: " + dado[x] + "\n");}

					//Sa�da de Dados 2:
						//Sa�da de Dados com o Usu�rio, com Texto em Bloco:
						System.out.println("\nA m�dia dos resultados apresentados foi de: " + media);
						System.out.println("\nO maior resultado foi: " + maiorValor + ", ocorrendo por " + contador + " vezes.\n");
			}
}
		}