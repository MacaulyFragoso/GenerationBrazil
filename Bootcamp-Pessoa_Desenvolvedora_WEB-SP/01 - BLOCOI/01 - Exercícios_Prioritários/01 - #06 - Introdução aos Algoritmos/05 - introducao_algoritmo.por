programa
{

	 /*Programa: Média Escolar
	 * Atividade: Programação Sequencial - Exercico 5
	 * Autor: Macauly Fragoso
 	 * Data: 20/08/2021
 	 * Local: Fraco da Rocha, SP
 	 * Generation Brazil
 	 */
	
		funcao inicio()
		{
			//Variável e Declaração de Variável, respectivamente
			inteiro peso1 = 2, peso2 = 3, peso3 = 5

			inteiro valor1, valor2, valor3, media, soma1, soma2, soma3, mediaFinal

				//Entrada de Dados
					//Entrada de Dados 1
						escreva("Em números, digite o valor para a primeira nota: ")
						leia(valor1)

						escreva("Em números, digite o valor para a segunda nota: ")
						leia(valor2)

						escreva("Em números, digite o valor para a terceira nota: ")
						leia(valor3)

					//Processamento de Dados
						media = (valor1 + valor2 + valor3) / 3
						soma1 = media + peso1
						soma2 = media + peso2
						soma3 = media + peso3
						mediaFinal = (soma1 + soma2 + soma3) / 3

					//Saída de Dados	
						escreva( "1 matéria, nota: " + soma1 + "\n2 matéria, nota: " + soma2 + "\n3 matéria, nota: " + soma3 + "\nA média Final é: " + mediaFinal)
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 520; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */