//Package: Organizar Classes Relacionadas:
package org.java.introducao;

	/*Programa: NotatoN.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 5: Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada
 	   e que o peso das notas é: 2,3 e 5, respectivamente.*/
	
	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
			public class IntroducaoJava05{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: Não necessário ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

			//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
				Scanner leia = new Scanner(System.in);
					
			//Variável = Tipo de Dado + Declaração, respectivamente:
				int peso1 = 2, peso2 = 3, peso3 = 5;
				int valor1, valor2, valor3, media, soma1, soma2, soma3, mediaFinal;

			//Entrada de Dados:
				//Entrada de Dados com o Usuário, com Texto em Bloco:
				System.out.println("Em números, digite o valor para a primeira nota: ");
					
				//Para a Leitura dos Dados Inseridos pelo Usuário:
				valor1 = leia.nextInt();

				System.out.println("Em números, digite o valor para a segunda nota: ");
				valor2 = leia.nextInt();

				System.out.println("Em números, digite o valor para a terceira nota: ");
				valor3 = leia.nextInt();

			//Processamento de Dados:
				media = (valor1 + valor2 + valor3) / 3;
				soma1 = media + peso1;
				soma2 = media + peso2;
				soma3 = media + peso3;
				mediaFinal = (soma1 + soma2 + soma3) / 3;

			//Saída de Dados:
				//Saída de Dados com o Usuário, com Texto em Bloco:
				System.out.println( "1 matéria, nota: " + soma1 + "\n2 matéria, nota: " + soma2 + "\n3 matéria, nota: " + soma3 + "\nA média Final é: " + mediaFinal);
				
		}
			
}
