// Função do Algoritmo: Calcular a média aritmética
// Autor: Felipe Cabral

programa
{
	
	funcao inicio()
	{
		inteiro menu = 0, case = 0

		escreva("1 - Abrir Netflix \n2 - Abrir Amazon Prime \n3 - Abrir HBO MAX \n4 - Sair")

		escreva("\nSua opção: ")
		leia(menu)
		
		se(menu ==1){
			escreva("Abrir Netflix!")
		}
		se(menu ==2){
			escreva("Abrir Amazon Prime!")
		}
		se(menu ==3){
			escreva("Abrir HBO MAX!")
		}
		se(menu ==4){
			escreva("Saindo do menu...")
		}

		// Forma correta de escrever esse código utilizando o caso

		escreva("\n\nnova opção: ")
			leia(case)
			escolha (case)
			{
			caso 1: // testa valor da variável, se verdade exibe a bloco no caso a mensagem.
			escreva("Abrir Netflix!")
			pare
	
			caso 2:
			escreva("Abrir Amazon Prime!")
			pare
	
			caso 3:
			escreva("Abrir HBO MAX!")
			pare
	
			caso 4:
			escreva("Saindo do menu...")
			pare
	
			caso contrario:
			escreva("Você deve escolher umas das opções!")
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 875; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */