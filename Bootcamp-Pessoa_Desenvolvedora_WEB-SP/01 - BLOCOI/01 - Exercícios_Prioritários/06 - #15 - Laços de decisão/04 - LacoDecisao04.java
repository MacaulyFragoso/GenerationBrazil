//Package: Organizar Classes Relacionadas:
package org.decisao.laco;

	/*Programa: 
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #15 - La�os de decis�o.
 	 * Exerc�cio 4: Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada
 	   do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos:
			public class LacoDecisao04{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: N�o necess�rio ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O m�todo n�o est� dando retorno algum); Main: Nome do M�todo; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

				//Vari�vel = Tipo de Dado + Declara��o, respectivamente:
					double numero;

				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
					Scanner leia = new Scanner(System.in);
					
				//Entrada de Dados:
					//Entrada de Dados 1:
						//Utilizando a Classe Scanner, para a Entrada de Dados com o Usu�rio, com Texto em Bloco:
						System.out.println("\nPara iniciarmos, digite o 1� N�mero que vier a sua mente: ");
							
						//Utilizando a Classe Scanner; Referenciando a Vari�vel em quest�o (ano); A declara��o do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int):
						numero = leia.nextDouble();
			      		
				//Processamento de Dados:
			     	if(numero % 2 == 0){
			     		System.out.println("\nO n�mero " + numero + " � par. E sua Raiz Quadrada �: " + Math.sqrt(numero));
			        }
			        	
			     		else{
				   			System.out.println("\nO n�mero " + numero + " � impar. Elevado ao Quadrado, ele tem o resultado de: "  + numero * numero);
				   		}
				   		
				}
				
			}
			
