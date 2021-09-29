//Package: Organizar Classes Relacionadas:
package org.decisao.laco;

	/*Programa: NumerAll.
	 * Autor: Macauly Fragoso.
	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
	 * BLOCO I.
	 * #15 - Laços de decisão.
	 * Exercício 2: Faça um programa que entre com três números e coloque em ordem crescente.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
			public class LacoDecisao02 {

				//Public: Modificador de Acesso, que permite qualquer outra classe acessar;
				//Static: Não necessário ser instanciada (Definida pela Classe);
				//Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando
				//retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome:
					public static void main(String[] args) {

					//Variável = Tipo de Dado + Declaração, respectivamente:
						int numero1, numero2, numero3, libero;

					//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
						Scanner leia = new Scanner(System.in);

					//Entrada de Dados:
						//Utilizando a Classe Scanner, para a Entrada de Dados com o Usuário, com Texto em Bloco:
						System.out.println("Para números em ordem crescente, digite o primeiro número que vier à sua mente: ");
						numero1 = leia.nextInt();
						System.out.println("Vamos lá, agora o segundo número: ");
						numero2 = leia.nextInt();
						System.out.println("Booooooa! Agora o terceiro número: ");
						numero3 = leia.nextInt();
							
					//Processamento de Dados:
							//Processamento de Dados 1:
							if(numero2<numero1) {
								libero = numero2;
								numero2 = numero1;
								numero1 = libero;
							}
							
							//Processamento de Dados 2:
							if(numero3<numero2) {
								libero = numero3;
								numero3 = numero2;
								numero2 = libero;
							}
							
							//Processamento de Dados 3:
							if(numero2<numero1) {
								libero = numero2;
								numero2 = numero1;
								numero1 = libero;
							}
							
					//Saida de Dados:
							System.out.println(numero1+" "+numero2+" "+numero3);

					}

}
