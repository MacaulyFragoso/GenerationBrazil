programa
{
	/*Programa: Cronometro de evento
	 * Atividade: Programação Sequencial - Exercico 3
	 * Autor: Macauly Fragoso
 	 * Data: 20/08/2021
 	 * Local: Fraco da Rocha, SP
 	 * Generation Brazil
 	 */
	
		funcao inicio()
	{
			//Variável e Declaração de Variável, respectivamente
				inteiro segundo, hora, minuto, segundos

				//Entrada de Dados
					//Entrada de Dados 1
						escreva("Em números, digite quantos segundos durou o evento: ")
						leia(segundo)

					//Processamento de Dados
						hora = segundo / 3600
						minuto = (segundo % 3600)/60
						segundos = (segundo % 3600)%60

					//Saída de Dados	
						escreva( "O evento durou: " + hora + " horas " + minuto + " minutos " + segundos + " segundos ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 46; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */