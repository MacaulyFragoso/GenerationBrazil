//Package: Organizar Classes Relacionadas:
package org.java.introducao;

	/*Programa: CalculoExpress3
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdu��o aos Algoritmos.
 	 * Exerc�cio 7: Um sistema de equa��es lineares do tipo: ax + by = c e dx + ey = f, pode ser resolvido segundo mostrado abaixo:
 	   x = ce-bf/ae-bd e y = af-cd/ae-bd. Escreva um sistema que l� os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos:
			public class IntroducaoJava07{

				//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: N�o necess�rio ser instanciada (Definida pela Classe);
				//Void: Um tipo de Retorno de Dado, esse sem Valor (O m�todo n�o est� dando retorno algum); Main: Nome do M�todo; String[] args: Tipo de Dado + Nome:
					public static void main(String[] args){

						//Vari�vel = Tipo de Dado + Declara��o, respectivamente:
							double a,b,c,d,e,f,x,y;
	
						//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
							Scanner leia = new Scanner(System.in);
							
						//Entrada de Dados:
							//Entrada de Dados 1:
								//Utilizando a Classe Scanner, para a Entrada de Dados com o Usu�rio, com Texto em Bloco:
								System.out.println("Para come�armos, digite o valor A: ");
								
								//Utilizando a Classe Scanner; Referenciando a Vari�vel em quest�o (ano); A declara��o do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int):
								a = leia.nextDouble();

								System.out.println("Agora, digite o valor B: ");
								b = leia.nextDouble();

								System.out.println("Show! agora digite o valor C: ");
								c = leia.nextDouble();

								System.out.println("Estamos quase l�, digite agora o valor D: ");
								d = leia.nextDouble();

								System.out.println("Prometo que falta pouco, digite agora o valor E: ");
								e = leia.nextDouble();

								System.out.println("S� falta mais um! Digite agora o valor de F: ");
								f = leia.nextDouble();

						//Processamento de Dados:
								x=(c*e)-(b*f)/(a*e)-(b*d);
								y=(a*f)-(c*d)/(a*e)-(b*d);

						//Sa�da de Dados:
								System.out.println("O valor de X �: " + Math.ceil(x) + "  - " + " O valor de Y �: " + Math.ceil(y));
								
			}
			
}