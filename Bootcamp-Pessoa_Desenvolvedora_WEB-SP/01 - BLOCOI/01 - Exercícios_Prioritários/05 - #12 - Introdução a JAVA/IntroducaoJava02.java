//Package: Organizar Classes Relacionadas:
package org.java.introducao;

	/*Programa: ConverS�rio.
	 * Autor: Macauly Fragoso.
	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
	 * BLOCO I.
	 * #12 - Introdu��o a JAVA.
	 * Exerc�cio 2: Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos:
			public class IntroducaoJava02{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: N�o necess�rio ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O m�todo n�o est� dando retorno algum); Main: Nome do M�todo; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

			//Vari�vel = Tipo de Dado + Declara��o, respectivamente:
				int idadeDias, anos, meses, dias;
	
			//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
				Scanner leia = new Scanner(System.in);
	
			//Entrada de Dados:
				//Utilizando a Classe Scanner, para a Entrada de Dados com o Usu�rio, com Texto em Bloco:
				System.out.println("Em n�meros, digite quantos dias de vida voc� tem: ");
				
				//Utilizando a Classe Scanner; Referenciando a Vari�vel em quest�o (idadeDias); A declara��o do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int).
				idadeDias = leia.nextInt();

			//Processamento de Dados:
				anos = idadeDias / 365;
				meses = (idadeDias % 365)%12;
				dias = (idadeDias % 365)%30;

			//Sa�da de Dados:
				//Sa�da de Dados com o Usu�rio, com Texto em Bloco:
				System.out.println( "Voc� tem: " + anos + " anos " + meses + " meses " + dias + " dias ");
					
		}
				
}