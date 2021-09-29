//Package: Organizar Classes Relacionadas:
package org.decisao.laco;

	/*Programa: 
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #15 - Laços de decisão.
 	 * Exercício 01: Faça um programa que receba três inteiros e diga qual deles é o maior.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
			public class LacoDecisao01{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: Não necessário ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

				//Variável = Tipo de Dado + Declaração, respectivamente:
					int numero1, numero2, numero3;

				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
					Scanner leia = new Scanner(System.in);
					
				//Entrada de Dados:
					//Entrada de Dados 1:
						//Utilizando a Classe Scanner, para a Entrada de Dados com o Usuário, com Texto em Bloco:
						System.out.println("\nPara iniciarmos, digite o 1° Número que vier a sua mente: ");
							
						//Utilizando a Classe Scanner; Referenciando a Variável em questão (ano); A declaração do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int):
						numero1 = leia.nextInt();
						
					//Entrada de Dados 2:
						System.out.println("\nPara iniciarmos, digite o 1° Número que vier a sua mente: ");
						
						numero2 = leia.nextInt();
						
					//Entrada de Dados 3:
						System.out.println("\nPara iniciarmos, digite o 1° Número que vier a sua mente: ");
						
						numero3 = leia.nextInt();
			      		
				//Processamento de Dados:
			     	if(numero1 > numero2) {
			     		System.out.println("\nO número " + numero1 + " É par. E sua Raiz Quadrada é: ");
			     		
			     		}else if(numero2 > numero3){
			        		System.out.println("\nO número " + numero2 + " É impar. Elevado ao Quadrado, ele tem o resultado de: ");
			        	
				   		
			     		}else{
			        	System.out.println("\nO número " + numero3 + " É impar. Elevado ao Quadrado, ele tem o resultado de: ");
			   		
			     	
				}
				
			}
				
			}