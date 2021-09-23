//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: Balançou.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #08 - Laços Condicionais.
 	 * Exercício 1: João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de
 	   tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa
 	   que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M
 	   o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/

 	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){
		
		//Variável = Tipo de Dado + Declaração + Valor, respectivamente: 
			real pesoReg = 50.0
			inteiro peso, multa = 0

		//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco: 
			escreva("Insira o peso do Tomate: ")
			//Para a Leitura dos Dados Inseridos pelo Usuário:
			leia(peso)

		//Processamento de Dados:
			se(peso == 50){
			escreva("Multa: R$ 0,00 ")
			}

				senao se(peso >= pesoReg){
				multa = (peso * 4.00) - 50
				escreva("Multa: R$ " + multa)
				}
			
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
