//Package: Organizar Classes Relacionadas:
package org.java.introducao;

	/*Programa: Cron�metroX.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdu��o aos Algoritmos.
 	 * Exerc�cio 3: Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
	
	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos:
			public class IntroducaoJava03{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: N�o necess�rio ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O m�todo n�o est� dando retorno algum); Main: Nome do M�todo; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

			//Vari�vel = Tipo de Dado + Declara��o, respectivamente:
				int segundo, hora, minuto, segundos;
				
			//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
				Scanner leia = new Scanner(System.in);
	
			//Entrada de Dados:
				//Utilizando a Classe Scanner, para a Entrada de Dados com o Usu�rio, com Texto em Bloco:
				System.out.println("Em n�meros, digite quantos segundos durou o evento: ");
				
				//Para a Leitura dos Dados Inseridos pelo Usu�rio:
				segundo = leia.nextInt();

			//Processamento de Dados:
				hora = segundo / 3600;
				minuto = (segundo % 3600)/60;
				segundos = (segundo % 3600)%60;

			//Sa�da de Dados:
				//Sa�da de Dados com o Usu�rio, com Texto em Bloco:
				System.out.println( "O evento durou: " + hora + " horas " + minuto + " minutos " + segundos + " segundos ");
			
		}
		
}