//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: XMultiXX.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #09 - Laços de Repetição | FACA...ENQUANTO (DO...WHILE).
 	 * Exercício 2: Faça um programa que pegue um número do teclado e calcule a soma de todos os números de 1 até ele. Ex.: o usuário entra 7, o programa
 	   vai mostrar 28, pois 1+2+3+4+5+6+7=28.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){

		//Variável = Tipo de Dado + Declaração + Valor, respectivamente:
			inteiro numero = 0, soma=0, contador=0

	 	//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco:
			escreva("Para iniciarmos, digite o 1° número que vier à sua mente: ")
			//Para a Leitura dos Dados Inseridos pelo Usuário:
			leia(numero)
			
		//Processamento de Dados:
			faca{
			soma = soma + contador
			contador++
			}
			
				enquanto(contador <= numero)
				
		//Saída de Dados:
			//Saída de Dados com o Usuário, com Texto em Bloco:
				escreva("\nPartindo do número 1, somando todos os números até o número que você escolheu, chegamos em: ",soma)
				
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1211; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */