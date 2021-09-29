//Package: Organizar Classes Relacionadas:
package org.decisao.laco;

	/*Programa: NumerAll.
	 * Autor: Macauly Fragoso.
	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
	 * BLOCO I.
	 * #15 - La�os de decis�o.
	 * Exerc�cio 2: Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos:
			public class LacoDecisao02 {

				//Public: Modificador de Acesso, que permite qualquer outra classe acessar;
				//Static: N�o necess�rio ser instanciada (Definida pela Classe);
				//Void: Um tipo de Retorno de Dado, esse sem Valor (O m�todo n�o est� dando
				//retorno algum); Main: Nome do M�todo; String[] args: Tipo de Dado + Nome:
					public static void main(String[] args) {

					//Vari�vel = Tipo de Dado + Declara��o, respectivamente:
						int numero1, numero2, numero3, libero;

					//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
						Scanner leia = new Scanner(System.in);

					//Entrada de Dados:
						//Utilizando a Classe Scanner, para a Entrada de Dados com o Usu�rio, com Texto em Bloco:
						System.out.println("Para n�meros em ordem crescente, digite o primeiro n�mero que vier � sua mente: ");
						numero1 = leia.nextInt();
						System.out.println("Vamos l�, agora o segundo n�mero: ");
						numero2 = leia.nextInt();
						System.out.println("Booooooa! Agora o terceiro n�mero: ");
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
