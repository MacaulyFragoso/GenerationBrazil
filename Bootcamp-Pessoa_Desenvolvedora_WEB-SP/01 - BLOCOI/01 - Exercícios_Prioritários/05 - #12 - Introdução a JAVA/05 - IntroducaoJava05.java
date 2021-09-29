//Package: Organizar Classes Relacionadas:
package org.java.introducao;

	/*Programa: NotatoN.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdu��o aos Algoritmos.
 	 * Exerc�cio 5: Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada
 	   e que o peso das notas �: 2,3 e 5, respectivamente.*/
	
	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos:
			public class IntroducaoJava05{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: N�o necess�rio ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O m�todo n�o est� dando retorno algum); Main: Nome do M�todo; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

			//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
				Scanner leia = new Scanner(System.in);
					
			//Vari�vel = Tipo de Dado + Declara��o, respectivamente:
				int peso1 = 2, peso2 = 3, peso3 = 5;
				int valor1, valor2, valor3, media, soma1, soma2, soma3, mediaFinal;

			//Entrada de Dados:
				//Entrada de Dados com o Usu�rio, com Texto em Bloco:
				System.out.println("Em n�meros, digite o valor para a primeira nota: ");
					
				//Para a Leitura dos Dados Inseridos pelo Usu�rio:
				valor1 = leia.nextInt();

				System.out.println("Em n�meros, digite o valor para a segunda nota: ");
				valor2 = leia.nextInt();

				System.out.println("Em n�meros, digite o valor para a terceira nota: ");
				valor3 = leia.nextInt();

			//Processamento de Dados:
				media = (valor1 + valor2 + valor3) / 3;
				soma1 = media + peso1;
				soma2 = media + peso2;
				soma3 = media + peso3;
				mediaFinal = (soma1 + soma2 + soma3) / 3;

			//Sa�da de Dados:
				//Sa�da de Dados com o Usu�rio, com Texto em Bloco:
				System.out.println( "1 mat�ria, nota: " + soma1 + "\n2 mat�ria, nota: " + soma2 + "\n3 mat�ria, nota: " + soma3 + "\nA m�dia Final �: " + mediaFinal);
				
		}
			
}
