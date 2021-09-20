//Package: Organizar Classes Relacionadas.
package org.laco.decisao;

	/*Programa: Qual é a sua classificação indicativa?
	 * Autor: Macauly Fragoso.
	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
	 * BLOCO I.
	 * #15 - Laços de decisão.
	 * Exercício 3: Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
	 - 10-14 infantil;
	 - 15-17 juvenil;
	 - 18-25 adulto.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos.
	import java.util.Scanner;

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos.
	public class Laco_Decisao03{

		//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: Não necessário ser instanciada (Definida pela Classe);
		//Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome.
		public static void main(String[] args){
		
			//Variável = Tipo de Dado + Declaração, respectivamente.
				int idade;
				
				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia.
				Scanner leia = new Scanner(System.in);
				
			//Entrada de Dados:
				//Utilizando a Classe Scanner, para a Entrada de Dados com o Usuário, com Texto em Bloco.
				System.out.println("Você gostaria de saber qual é a sua Classificação Indicativa?\nSe sim, responda!\nEm números, quantos anos você tem?\n ");
				//Utilizando a Classe Scanner; Referenciando a Variável em questão (ano); A declaração do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int).
				idade = leia.nextInt();
			
			//Processamento de Dados:
				/*A condicional if  é uma estrutura condicional que executa a afirmação, dentro do bloco, se determinada condição for verdadeira.
				  Se for falsa, executa as afirmações dentro de else.*/
				//Operadores Relacionais: <: Menor; >: Maior; =: Igual.
				//Operador Lógicp: &&: Obrigatoriamente Verdadeiro.
				if(idade <= 9){
					System.out.println("Classificação Inválida");				
					}
					else if(idade >= 10 && idade <= 14){
						System.out.println("A sua Classificação é: Infantil");			
						}
						else if(idade >= 15 && idade <= 17){
							System.out.println("A sua Classificação é: Juvenil");
							}
							else if(idade >= 18 && idade <= 25){
								System.out.println("A sua Classificação é: Adulto");
								}
								else if(idade >= 26){
									System.out.println("Classificação Inválida");
									}
	
												}

								}
