//Package: Organizar Classes Relacionadas:
package org.java.introducao;

	/*Programa: ConverSário.
	 * Autor: Macauly Fragoso.
	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
	 * BLOCO I.
	 * #12 - Introdução a JAVA.
	 * Exercício 2: Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
			public class IntroducaoJava02{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: Não necessário ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

			//Variável = Tipo de Dado + Declaração, respectivamente:
				int idadeDias, anos, meses, dias;
	
			//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
				Scanner leia = new Scanner(System.in);
	
			//Entrada de Dados:
				//Utilizando a Classe Scanner, para a Entrada de Dados com o Usuário, com Texto em Bloco:
				System.out.println("Em números, digite quantos dias de vida você tem: ");
				
				//Utilizando a Classe Scanner; Referenciando a Variável em questão (idadeDias); A declaração do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int).
				idadeDias = leia.nextInt();

			//Processamento de Dados:
				anos = idadeDias / 365;
				meses = (idadeDias % 365)%12;
				dias = (idadeDias % 365)%30;

			//Saída de Dados:
				//Saída de Dados com o Usuário, com Texto em Bloco:
				System.out.println( "Você tem: " + anos + " anos " + meses + " meses " + dias + " dias ");
					
		}
				
}