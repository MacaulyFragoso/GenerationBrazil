//Package: Organizar Classes Relacionadas:
package org.java.introducao;

	/*Programa: CronômetroX.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 3: Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
	
	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
			public class IntroducaoJava03{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: Não necessário ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

			//Variável = Tipo de Dado + Declaração, respectivamente:
				int segundo, hora, minuto, segundos;
				
			//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
				Scanner leia = new Scanner(System.in);
	
			//Entrada de Dados:
				//Utilizando a Classe Scanner, para a Entrada de Dados com o Usuário, com Texto em Bloco:
				System.out.println("Em números, digite quantos segundos durou o evento: ");
				
				//Para a Leitura dos Dados Inseridos pelo Usuário:
				segundo = leia.nextInt();

			//Processamento de Dados:
				hora = segundo / 3600;
				minuto = (segundo % 3600)/60;
				segundos = (segundo % 3600)%60;

			//Saída de Dados:
				//Saída de Dados com o Usuário, com Texto em Bloco:
				System.out.println( "O evento durou: " + hora + " horas " + minuto + " minutos " + segundos + " segundos ");
			
		}
		
}