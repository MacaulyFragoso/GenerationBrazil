//Package: Organizar Classes Relacionadas:
package org.decisao.laco;

	/*Programa: 
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #15 - La�os de decis�o.
 	 * Exerc�cio 01: Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos:
			public class LacoDecisao01{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: N�o necess�rio ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O m�todo n�o est� dando retorno algum); Main: Nome do M�todo; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

				//Vari�vel = Tipo de Dado + Declara��o, respectivamente:
					int numero1, numero2, numero3;

				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
					Scanner leia = new Scanner(System.in);
					
				//Entrada de Dados:
					//Entrada de Dados 1:
						//Utilizando a Classe Scanner, para a Entrada de Dados com o Usu�rio, com Texto em Bloco:
						System.out.println("\nPara iniciarmos, digite o 1� N�mero que vier a sua mente: ");
							
						//Utilizando a Classe Scanner; Referenciando a Vari�vel em quest�o (ano); A declara��o do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int):
						numero1 = leia.nextInt();
						
					//Entrada de Dados 2:
						System.out.println("\nPara iniciarmos, digite o 1� N�mero que vier a sua mente: ");
						
						numero2 = leia.nextInt();
						
					//Entrada de Dados 3:
						System.out.println("\nPara iniciarmos, digite o 1� N�mero que vier a sua mente: ");
						
						numero3 = leia.nextInt();
			      		
				//Processamento de Dados:
			     	if(numero1 > numero2) {
			     		System.out.println("\nO n�mero " + numero1 + " � par. E sua Raiz Quadrada �: ");
			     		
			     		}else if(numero2 > numero3){
			        		System.out.println("\nO n�mero " + numero2 + " � impar. Elevado ao Quadrado, ele tem o resultado de: ");
			        	
				   		
			     		}else{
			        	System.out.println("\nO n�mero " + numero3 + " � impar. Elevado ao Quadrado, ele tem o resultado de: ");
			   		
			     	
				}
				
			}
				
			}