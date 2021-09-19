//Package: Organizar Classes Relacionadas.
package org.generation.brazil;

	/*Programa: H� quantos dias voc� est� na Terra?
	 * Autor: Macauly Fragoso.
	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
	 * BLOCO I.
	 * #12 - Introdu��o a JAVA.
	 * Exerc�cio 1: Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos.
	import java.util.Scanner;

	//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos.
	public class Exercicio1{

		//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: N�o necess�rio ser instanciada (Definida pela Classe);
		//Void: Um tipo de Retorno de Dado, esse sem Valor (O m�todo n�o est� dando retorno algum); Main: Nome do M�todo; String[] args: Tipo de Dado + Nome.
		public static void main(String[] args){
		
			//Vari�vel = Tipo de Dado + Declara��o, respectivamente.
				int anos, meses, dias;
			
				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia.
				Scanner leia = new Scanner(System.in);
			
			//Entrada de Dados:
				//Entrada de Dados 1:
					//Utilizando a Classe Scanner, para a Entrada de Dados com o Usu�rio, com Texto em Bloco.
					System.out.println("Voc� gostaria de saber h� quantos dias voc� est� na Terra?\nSe sim, responda!\nEm n�meros, quantos anos voc� tem?\n ");
					//Utilizando a Classe Scanner; Referenciando a Vari�vel em quest�o (ano); A declara��o do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int).
					anos = leia.nextInt();
					
				//Entrada de Dados 2:
					//Utilizando a Classe Scanner, para a Entrada de Dados com o Usu�rio, com Texto em Bloco.
					System.out.println("\nAgora... Em n�meros, em que m�s voc� nasceu?\n ");
					//Utilizando a Classe Scanner; Referenciando a Vari�vel em quest�o (ano); A declara��o do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int).
					meses = leia.nextInt();
					
				//Entrada de Dados 3:
					//Utilizando a Classe Scanner, para a Entrada de Dados com o Usu�rio, com Texto em Bloco.
					System.out.println("\nEstamos quase l�... Em n�meros, qual foi o dia em que voc� nasceu?\n ");
					//Utilizando a Classe Scanner; Referenciando a Vari�vel em quest�o (ano); A declara��o do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int).
					dias = leia.nextInt();
					
			//Processamento de Dados:
					//Processamento L�gico onde o Dia em que o Usu�rio nasceu, ser� = ao destrinchamento de anos e meses que ele tem, sendo ano com valor 365 e mes com valor 30.
					dias = ((anos * 365) + (meses * 30) + dias);

			//Sa�da de Dados:
					//Utilizando a Classe Scanner, para a Sa�da de Dados com o Usu�rio, com Texto em Bloco. Com "dias", referenciando o resultado do processamento.
					System.out.println("\nVoc� est� na terra h�: " + dias + " dias\n\nObrigado!");
				
												}

							}
