programa
{
	
	funcao inicio()
	{
		// Vetor
		cadeia frutas[4]
		inteiro cont = 0

		frutas[0] = "Maçã"
		frutas[1] = "Banana"
		frutas[2] = "Uva"
		frutas[3] = "Pera"

		faca
		{
			escreva("\nPara a posição " + cont + " temos o valor: " + frutas[cont])
			cont++
			
		}enquanto (cont <= 3)


		// Matriz
		escreva("\n\n")

		cadeia cesta[][] = {{"Maçã","100"},{"Banana","10"},{"Uva","50"},{"Pera","100"}}

		escreva("Produto: " + cesta[0][0] + "\nQuantidade: " + cesta[0][1])

		inteiro contador = 0

		faca
		{
			escreva("\nProduto: " + cesta[contador][0] + "    Quantidade: " + cesta[contador][1])
			contador++			
		}enquanto(contador <= 3)

		

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 573; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */