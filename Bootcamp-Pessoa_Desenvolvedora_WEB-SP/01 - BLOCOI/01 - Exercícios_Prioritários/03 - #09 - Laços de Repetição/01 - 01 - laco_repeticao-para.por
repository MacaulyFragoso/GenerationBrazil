//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: Pópuli.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #09 - Laços de Repetição | PARA (FOR).
 	 * Exercício 1: A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos.
 	   A prefeitura deseja saber:  
     a) média do salário da população;
     b) média do número de filhos;
     c) maior salário;
     d) percentual de pessoas com salário até R$100,00.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){

		//Variável = Tipo de Dado + Declaração + Valor, respectivamente:
			inteiro habitante, numeroFilhos
			real salario, mediaSalario = 0.0, mediaFilhos = 0.0, maiorSalario = 0.0, percentualPs100 = 0.0, totalSalario = 0.0, totalFilhos = 0.0
		
		//Processamento de Dados:
			//Processamento de Dados 1:
				para(habitante = 1; habitante <= 5; habitante++){
					
		//Entrada de Dados:
			//Entrada de Dados 1:
				//Entrada de Dados com o Usuário, com Texto em Bloco:
				escreva("Digite o Salário do " + habitante + "º "+ "habitante: R$")
				//Para a Leitura dos Dados Inseridos pelo Usuário:
				leia(salario)

				totalSalario = totalSalario + salario
				mediaSalario = totalSalario / 5

			//Processamento de Dados 2:
				se(salario > maiorSalario){
				maiorSalario = salario
				}

			//Processamento de Dados 3:
				se(salario <= 100){
				percentualPs100 = salario * 100 / 5 / 100
				}
				
			//Entrada de Dados 2:
				escreva("Digite a quantidade de Filhos do " + habitante + "º " + "habitante: ")
				leia(numeroFilhos)

				totalFilhos = totalFilhos + numeroFilhos
				mediaFilhos = totalFilhos / 5
				}	

		//Saída de Dados:
			//Saída de Dados com o Usuário, com Texto em Bloco:
			escreva("\nA média do salário da população é: R$" + mediaSalario)
			escreva("\nA média da quantidade de filhos é: " + mediaFilhos)
			escreva("\nO maior salário na população é: R$" + maiorSalario)
			escreva("\nPercentual de pessoas com salário até R$100,00 é de: " + percentualPs100 + "%" + "\n")	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2170; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */