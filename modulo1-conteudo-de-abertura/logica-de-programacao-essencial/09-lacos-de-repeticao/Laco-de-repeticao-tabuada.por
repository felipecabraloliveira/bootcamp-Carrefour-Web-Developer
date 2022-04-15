// Calculo de Tabuada.

programa
{
	
	funcao inicio()
	{
		inteiro cont = 0, numero, limite

		escreva("Qual número você quer a Tabuada: ")
		leia(numero)

		escreva("Qual o limite da tabuada: ")
		leia(limite)		
		
		faca
		{
			escreva("\n" + numero + " X " + cont + " = " + numero * cont)
			cont+=1
		}enquanto (cont <= limite)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 76; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */