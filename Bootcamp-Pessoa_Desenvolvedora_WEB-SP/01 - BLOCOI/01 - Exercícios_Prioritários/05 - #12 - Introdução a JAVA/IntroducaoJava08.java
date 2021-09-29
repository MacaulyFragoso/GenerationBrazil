//Package: Organizar Classes Relacionadas:
package org.java.introducao;

	/*Programa: ConcessCalc
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdu��o aos Algoritmos.
 	 * Exerc�cio 8: O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos
 	   impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que
 	   leia o custo de f�brica de um carro e escreva o custo ao consumidor.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos:
			public class IntroducaoJava08{

			//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: N�o necess�rio ser instanciada (Definida pela Classe);
			//Void: Um tipo de Retorno de Dado, esse sem Valor (O m�todo n�o est� dando retorno algum); Main: Nome do M�todo; String[] args: Tipo de Dado + Nome:
				public static void main(String[] args){

				//Vari�vel = Tipo de Dado + Declara��o, respectivamente:
					double custoConsumidor, custoFabrica, distribuidor, impostos; 

				//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
					Scanner leia = new Scanner(System.in);
				
				//Entrada de Dados:
					//Entrada de Dados 1:
						//Utilizando a Classe Scanner, para a Entrada de Dados com o Usu�rio, com Texto em Bloco:
						System.out.println("Para iniciarmos, digite o valor de f�brica do ve�culo: ");
					
					//Utilizando a Classe Scanner; Referenciando a Vari�vel em quest�o (ano); A declara��o do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int):
						custoFabrica = leia.nextDouble();

				//Processamento de Dados:
					//Processamento de Dados 1:
						distribuidor = custoFabrica * 0.28;
						impostos = custoFabrica * 0.45;
			
					//Processamento de Dados 2:
						custoConsumidor = custoFabrica + distribuidor + impostos;
			
				//Sa�da de Dados:
						System.out.println("O custo ao consumidor do ve�culo �: " + Math.ceil (custoConsumidor));
				
				}
			
}