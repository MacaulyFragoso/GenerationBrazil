//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: XMultiXX.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #09 - Laços de Repetição | ENQUANTO (WHILE).
 	 * Exercício 2: Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três (imprimindo o novo valor) até que ele seja
 	   maior do que 100. Ex.: se o usuário digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){

		//Variável = Tipo de Dado + Declaração + Valor, respectivamente:
			real numero = 0.00

		//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco:
			escreva("Para iniciarmos, digite um número: ")
			//Para a Leitura dos Dados Inseridos pelo Usuário:
			leia(numero)

		//Processamento de Dados:
			enquanto (numero < 100){
			numero = numero * 3

		//Saída de Dados:
			//Saída de Dados com o Usuário, com Texto em Bloco:
			escreva("\n" + numero)
			}
			
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1096; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */