//Package: Organizar Classes Relacionadas.
package org.generation.brazil;

	/*Programa: Há quantos dias você está na Terra?
	 * Autor: Macauly Fragoso.
	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
	 * BLOCO I.
	 * #12 - Introdução a JAVA.
	 * Exercício 1: Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos.
	import java.util.Scanner;

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos.
	public class Exercicio1{

		//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: Não necessário ser instanciada (Definida pela Classe);
		//Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome.
		public static void main(String[] args){
		
			//Variável = Tipo de Dado + Declaração, respectivamente.
				int anos, meses, dias;
			
				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia.
				Scanner leia = new Scanner(System.in);
			
			//Entrada de Dados:
				//Entrada de Dados 1:
					//Utilizando a Classe Scanner, para a Entrada de Dados com o Usuário, com Texto em Bloco.
					System.out.println("Você gostaria de saber há quantos dias você está na Terra?\nSe sim, responda!\nEm números, quantos anos você tem?\n ");
					//Utilizando a Classe Scanner; Referenciando a Variável em questão (ano); A declaração do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int).
					anos = leia.nextInt();
					
				//Entrada de Dados 2:
					//Utilizando a Classe Scanner, para a Entrada de Dados com o Usuário, com Texto em Bloco.
					System.out.println("\nAgora... Em números, em que mês você nasceu?\n ");
					//Utilizando a Classe Scanner; Referenciando a Variável em questão (ano); A declaração do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int).
					meses = leia.nextInt();
					
				//Entrada de Dados 3:
					//Utilizando a Classe Scanner, para a Entrada de Dados com o Usuário, com Texto em Bloco.
					System.out.println("\nEstamos quase lá... Em números, qual foi o dia em que você nasceu?\n ");
					//Utilizando a Classe Scanner; Referenciando a Variável em questão (ano); A declaração do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int).
					dias = leia.nextInt();
					
			//Processamento de Dados:
					//Processamento Lógico onde o Dia em que o Usuário nasceu, será = ao destrinchamento de anos e meses que ele tem, sendo ano com valor 365 e mes com valor 30.
					dias = ((anos * 365) + (meses * 30) + dias);

			//Saída de Dados:
					//Utilizando a Classe Scanner, para a Saída de Dados com o Usuário, com Texto em Bloco. Com "dias", referenciando o resultado do processamento.
					System.out.println("\nVocê está na terra há: " + dias + " dias\n\nObrigado!");
				
												}

							}
