//Package: Organizar Classes Relacionadas.
programa{

	/*Programa: Qual a sua classificação indicativa?
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * Exercício 6: Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
	 - Infantil A = 5 a 7 anos;
	 - Infantil B = 8 a 11 anos;
	 - Juvenil A = 12 a 13 anos;
	 - Juvenil B = 14 a 17 anos;
	 - Adultos = Maiores de 18 anos.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos.
	funcao inicio(){

   		//Variável = Tipo de Dado + Declaração, respectivamente.
   			inteiro idade

		//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco.
   			escreva("Insira a sua idade: ")
   			//Para a leitura de dados.
   			leia(idade)
   			
		//Processamento de Dados:
			/*A condicional se  é uma estrutura condicional que executa a afirmação, dentro do bloco, se determinada condição for verdadeira.
			  Se for falsa, executa as afirmações dentro de senao se.*/
			//Operadores Relacionais: <: Menor; >: Maior; =: Igual.
			//Operador Lógicp: &&: Obrigatoriamente Verdadeiro.
			se(idade <= 5){
			escreva("Classificação Inválida")				
			}
				senao se(idade >= 5 e idade <= 7){
				escreva("Classificação Infantil A")				
				}
					senao se(idade >= 8 e idade <= 10){
					escreva("Classificação Infantil B")
					}
						senao se(idade >= 11 e idade <= 13){
						escreva("Classificação Juvenil A")
						}
							senao se(idade >= 14 e idade <= 17){
							escreva("Classificação Juvenil B")
							}
								senao se(idade >= 11 e idade <= 13){
								escreva("Classificação Juvenil B")
								}
									senao se(idade >= 18){
									escreva("Classificação Adulto")
									}
									
				}

		}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1821; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */