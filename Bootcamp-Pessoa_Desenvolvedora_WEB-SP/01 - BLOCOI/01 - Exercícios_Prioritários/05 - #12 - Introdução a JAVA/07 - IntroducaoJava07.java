//Package: Organizar Classes Relacionadas:
package org.java.introducao;

	/*Programa: CalculoExpress3
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 7: Um sistema de equações lineares do tipo: ax + by = c e dx + ey = f, pode ser resolvido segundo mostrado abaixo:
 	   x = ce-bf/ae-bd e y = af-cd/ae-bd. Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.*/

	//Importando Biblioteca -> Classe Scanner: Separar a Entrada de Texto em Blocos:
		import java.util.Scanner;

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
			public class IntroducaoJava07{

				//Public: Modificador de Acesso, que permite qualquer outra classe acessar; Static: Não necessário ser instanciada (Definida pela Classe);
				//Void: Um tipo de Retorno de Dado, esse sem Valor (O método não está dando retorno algum); Main: Nome do Método; String[] args: Tipo de Dado + Nome:
					public static void main(String[] args){

						//Variável = Tipo de Dado + Declaração, respectivamente:
							double a,b,c,d,e,f,x,y;
	
						//Utilizando a Classe Scanner, para a Entrada de Dados, declarando-a como Leia:
							Scanner leia = new Scanner(System.in);
							
						//Entrada de Dados:
							//Entrada de Dados 1:
								//Utilizando a Classe Scanner, para a Entrada de Dados com o Usuário, com Texto em Bloco:
								System.out.println("Para começarmos, digite o valor A: ");
								
								//Utilizando a Classe Scanner; Referenciando a Variável em questão (ano); A declaração do Scanner (Leia); nextInt: Para a leitura de dados, referenciando o tipo de dado usado (Int):
								a = leia.nextDouble();

								System.out.println("Agora, digite o valor B: ");
								b = leia.nextDouble();

								System.out.println("Show! agora digite o valor C: ");
								c = leia.nextDouble();

								System.out.println("Estamos quase lá, digite agora o valor D: ");
								d = leia.nextDouble();

								System.out.println("Prometo que falta pouco, digite agora o valor E: ");
								e = leia.nextDouble();

								System.out.println("Só falta mais um! Digite agora o valor de F: ");
								f = leia.nextDouble();

						//Processamento de Dados:
								x=(c*e)-(b*f)/(a*e)-(b*d);
								y=(a*f)-(c*d)/(a*e)-(b*d);

						//Saída de Dados:
								System.out.println("O valor de X é: " + Math.ceil(x) + "  - " + " O valor de Y é: " + Math.ceil(y));
								
			}
			
}