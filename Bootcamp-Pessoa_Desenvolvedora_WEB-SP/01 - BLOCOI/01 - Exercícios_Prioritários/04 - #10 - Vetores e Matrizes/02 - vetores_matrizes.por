//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: PointStation.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #10 - Vetores e Matrizes.
 	 * Exercício 2: Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva
 	   esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior
 	   pontuação.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
		funcao inicio(){

		//Variável = Tipo de Dado + Declaração + Valor, respectivamente:
			inteiro lancamentoDado = 10, dado[10], soma = 0, maiorValor = 0, x = 0, contador = 0
			real media = 0.00

		//Processamento de Dados:
			//Processamento de Dados 1:
				para (x=0; x <lancamentoDado; x++){

		//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco:
			escreva("Digite aqui o " ,x+1, " resultado de lançamento do Dado: ")
			//Para a Leitura dos Dados Inseridos pelo Usuário:
			leia(dado[x])
			//Para Limpar os Dados Inseridos pelo Usuário:
			limpa()
			
				soma = soma + dado[x]
				media = soma / lancamentoDado

			//Processamento de Dados 2:
				se(dado[x] >= maiorValor){

			//Processamento de Dados 3:
				se(dado[x] == maiorValor){
				contador++}

			//Processamento de Dados 4:
					senao{
					contador=1}
				
				maiorValor = dado[x]
				}
			
				}

			//Processamento de Dados 5:
				para (x=0; x <lancamentoDado; x++){

		//Saída de Dados:
			//Saída de Dados 1:
				//Saída de Dados com o Usuário, com Texto em Bloco:
				escreva(x+1,"º Resultado: ",dado[x],"\n")}

			//Saída de Dados 2:
				//Saída de Dados com o Usuário, com Texto em Bloco:
				escreva("\nA média dos resultados apresentados foi de: ",media)
				escreva("\nO maior resultado foi: ",maiorValor,", ocorrendo por ",contador," vezes.\n")
				
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */