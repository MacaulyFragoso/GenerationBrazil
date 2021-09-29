//Package: Organizar Classes Relacionadas:
package org.java.introducao;

	/*Programa: ConcessCalc
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 8: O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos
 	   impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que
 	   leia o custo de fábrica de um carro e escreva o custo ao consumidor.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
			public class IntroducaoJava08{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: Não necessário ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

				//Variável = Tipo de Dado + Declaração, respectivamente:
					double custoConsumidor, custoFabrica, distribuidor, impostos; 

				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
					Scanner leia = new Scanner(System.in);
				
				//Entrada de Dados:
					//Entrada de Dados 1:
						//Utilizando a Classe Scanner, para a Entrada de Dados com o Usuário, com Texto em Bloco:
						System.out.println("Para iniciarmos, digite o valor de fábrica do veículo: ");
					
					//Utilizando a Classe Scanner; Referenciando a Variável em questão (ano); A declaração do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int):
						custoFabrica = leia.nextDouble();

				//Processamento de Dados:
					//Processamento de Dados 1:
						distribuidor = custoFabrica * 0.28;
						impostos = custoFabrica * 0.45;
			
					//Processamento de Dados 2:
						custoConsumidor = custoFabrica + distribuidor + impostos;
			
				//Saída de Dados:
						System.out.println("O custo ao consumidor do veículo é: " + Math.ceil (custoConsumidor));
				
				}
			
}