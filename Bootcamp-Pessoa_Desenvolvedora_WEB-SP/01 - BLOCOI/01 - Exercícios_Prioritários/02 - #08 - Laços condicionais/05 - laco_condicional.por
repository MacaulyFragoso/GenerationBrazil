//Package: Organizar Classes Relacionadas:
programa{

	/*Programa:
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #08 - Laços Condicionais.
 	 * Exercício 5: A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes do
 	   meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem
 	   suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir
 	   0,5 todos os grupos devem ser notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição medido e emita a notificação
 	   adequada aos diferentes grupos de empresas.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){
		
		//Variável = Tipo de Dado + Declaração, respectivamente:
			real indicePoluicao

		//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco:
			escreva("Para iniciarmos, em números, digite o índice de poluição atual: ")
			//Para a Leitura dos Dados Inseridos pelo Usuário:
			leia(indicePoluicao)

		//Processamento de Dados:
			se (indicePoluicao <= 0.25){
		//Saída de Dados:
			//Saída de Dados 1:
				//Saída de Dados com o Usuário:
				escreva("O Índice de poluição está em conformidade.")
		}
				senao se (indicePoluicao > 0.25 e indicePoluicao <= 0.3){
			//Saída de Dados 2:
				//Saída de Dados com o Usuário:
				escreva("Atencão! Os índices de poluição estão fora do limite. As industrias do 1º grupo serão intimadas a suspenderem as atividades.")
			}
				senao se(indicePoluicao == 0.4){
			//Saída de Dados 3:
				//Saída de Dados com o Usuário:
				escreva("Atenção! Os índices de poluição estão fora do limite. As industrias do 1º e 2º grupo serão intimadas a suspenderem suas atividades.")
			}
					senao{
			//Saída de Dados 4:
				//Saída de Dados com o Usuário:
				escreva("Alerta! Os níveis de poluição estão em níveis críticos! \nTodas as industrias devem paralisar suas atividades!")
			}

	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1957; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
