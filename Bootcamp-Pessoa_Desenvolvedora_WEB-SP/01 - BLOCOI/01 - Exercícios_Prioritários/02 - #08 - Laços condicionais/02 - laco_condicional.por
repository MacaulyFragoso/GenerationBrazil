//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: MasterERP.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #08 - Laços Condicionais.
 	 * Exercício 2: Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. E calcule
 	   o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na
 	   variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o
 	   salário excedente.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){

		//Variável = Tipo de Dado + Declaração, respectivamente:
			real C, N, E, Salario, Excedente

		//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco:
			escreva("Para iniciarmos, digite o seu código: ")
			//Para a Leitura dos Dados Inseridos pelo Usuário:
			leia(C)

			escreva("Ok! Agora, em números, digite as horas trabalhadas: ")
			leia(N)

		//Processamento de Dados:
			se (N > 50){
				E = N-50
				Excedente = E * 20
				Salario = 50 * 10
		//Saída de Dados:
			//Saída de Dados 1:
			escreva("\nSalario total: R$ ", Salario, "\nExcedentes: R$ ", Excedente)
			}
				
				senao{
					E = 0
					Salario = N * 10

			//Saída de Dados 2:
			escreva("\nSalario total: R$ ", Salario, "\nExcedentes: R$ ", Salario, E)
			}
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 37; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
