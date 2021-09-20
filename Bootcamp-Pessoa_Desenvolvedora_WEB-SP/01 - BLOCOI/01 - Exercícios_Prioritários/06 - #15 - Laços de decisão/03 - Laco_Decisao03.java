//Package: Organizar Classes Relacionadas.
package org.laco.decisao;

	/*Programa: Qual � a sua classifica��o indicativa?
	 * Autor: Macauly Fragoso.
	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
	 * BLOCO I.
	 * #15 - La�os de decis�o.
	 * Exerc�cio 3: Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
	 - 10-14 infantil;
	 - 15-17 juvenil;
	 - 18-25 adulto.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos.
	import java.util.Scanner;

	//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos.
	public class Laco_Decisao03{

		//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: N�o necess�rio ser instanciada (Definida pela Classe);
		//Void: Um tipo de Retorno de Dado, esse sem Valor (O m�todo n�o est� dando retorno algum); Main: Nome do M�todo; String[] args: Tipo de Dado + Nome.
		public static void main(String[] args){
		
			//Vari�vel = Tipo de Dado + Declara��o, respectivamente.
				int idade;
				
				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia.
				Scanner leia = new Scanner(System.in);
				
			//Entrada de Dados:
				//Utilizando a Classe Scanner, para a Entrada de Dados com o Usu�rio, com Texto em Bloco.
				System.out.println("Voc� gostaria de saber qual � a sua Classifica��o Indicativa?\nSe sim, responda!\nEm n�meros, quantos anos voc� tem?\n ");
				//Utilizando a Classe Scanner; Referenciando a Vari�vel em quest�o (ano); A declara��o do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int).
				idade = leia.nextInt();
			
			//Processamento de Dados:
				/*A condicional if  � uma estrutura condicional que executa a afirma��o, dentro do bloco, se determinada condi��o for verdadeira.
				  Se for falsa, executa as afirma��es dentro de else.*/
				//Operadores Relacionais: <: Menor; >: Maior; =: Igual.
				//Operador L�gicp: &&: Obrigatoriamente Verdadeiro.
				if(idade <= 9){
					System.out.println("Classifica��o Inv�lida");				
					}
					else if(idade >= 10 && idade <= 14){
						System.out.println("A sua Classifica��o �: Infantil");			
						}
						else if(idade >= 15 && idade <= 17){
							System.out.println("A sua Classifica��o �: Juvenil");
							}
							else if(idade >= 18 && idade <= 25){
								System.out.println("A sua Classifica��o �: Adulto");
								}
								else if(idade >= 26){
									System.out.println("Classifica��o Inv�lida");
									}
	
												}

								}
