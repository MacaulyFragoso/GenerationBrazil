//Package: Organizar Classes Relacionadas:
package org.decisao.laco;

	/*Programa: 
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #15 - Laços de decisão.
 	 * Exercício 4: Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada
 	   do mesmo; se for ímpar exiba o número elevado ao quadrado.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
			public class LacoDecisao04{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: Não necessário ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

				//Variável = Tipo de Dado + Declaração, respectivamente:
					double numero;

				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
					Scanner leia = new Scanner(System.in);
					
				//Entrada de Dados:
					//Entrada de Dados 1:
						//Utilizando a Classe Scanner, para a Entrada de Dados com o Usuário, com Texto em Bloco:
						System.out.println("\nPara iniciarmos, digite o 1° Número que vier a sua mente: ");
							
						//Utilizando a Classe Scanner; Referenciando a Variável em questão (ano); A declaração do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int):
						numero = leia.nextDouble();
			      		
				//Processamento de Dados:
			     	if(numero % 2 == 0){
			     		System.out.println("\nO número " + numero + " É par. E sua Raiz Quadrada é: " + Math.sqrt(numero));
			        }
			        	
			     		else{
				   			System.out.println("\nO número " + numero + " É impar. Elevado ao Quadrado, ele tem o resultado de: "  + numero * numero);
				   		}
				   		
				}
				
			}
			
