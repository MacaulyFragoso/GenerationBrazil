programa
{
	/*Programa: Qual a sua idade?
	 * Atividade: Programação Sequencial - Exercico 2
	 * Autor: Macauly Fragoso
 	 * Data: 20/08/2021
 	 * Local: Fraco da Rocha, SP
 	 * Generation Brazil
 	 */
		funcao inicio()
		{
			//Variável e Declaração de Variável, respectivamente
				inteiro idadeDias, anos, meses, dias

				//Entrada de Dados
					//Entrada de Dados 1
						escreva("Em números, digite quantos dias você tem de vida: ")
						leia(idadeDias)

					//Processamento de Dados
						anos = idadeDias / 365
						meses = (idadeDias % 365)%12
						dias = (idadeDias % 365)%30

					//Saída de Dados	
						escreva( "Você tem: " + anos + " anos " + meses + " meses " + dias + " dias ")
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */