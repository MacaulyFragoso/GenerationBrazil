//Package: Organizar Classes Relacionadas:
programa{

	/*Programa:
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #08 - Laços Condicionais.
 	 * Exercício 3: Desenvolva um sistema em que:
	 - Leia 4 (quatro) números;
	 - Calcule o quadrado de cada um;
	 - Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	 - Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){

		//Variável = Tipo de Dado + Declaração, respectivamente:
		inteiro numero1, numero2, numero3, numero4, quadrado1, quadrado2, quadrado3, quadrado4

		//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco:
			escreva("Para iniciarmos, digite 4 numeros a seguir: ")
			escreva("\nNumero 1: ")
			leia(numero1)
			
			escreva("\nNumero 2: ")
			leia(numero2)
			
			escreva("\nNumero 3: ")
			leia(numero3)
			
			escreva("\nNumero 4: ")
			leia(numero4)

		//Processamento de Dados:
			//Processamento de Dados 1:
			quadrado1 = numero1 * numero1
			quadrado2 = numero2 * numero2
			quadrado3 = numero3 * numero3
			quadrado4 = numero4 * numero4

			//Processamento de Dados 2:
			se (quadrado3 > 1000){

			//Entrada de Dados:
				//Entrada de Dados 1:
				escreva("O valor resultante do quadrado do terceiro é: " + quadrado3)
			}
			senao{

				//Entrada de Dados 2:
				escreva("\nO valor quadrado do número " + numero1 + " é igual a: " + quadrado1)
				escreva("\nO valor quadrado do número " + numero2 + " é igual a: " + quadrado2)
				escreva("\nO valor quadrado do número " + numero3 + " é igual a: " + quadrado3)
				escreva("\nO valor quadrado do número " + numero4 + " é igual a: " + quadrado4)
			}
			
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1833; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */