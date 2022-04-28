programa
{
	inclua biblioteca Matematica -->m
	
	funcao inicio()
	{
		real x1, x2, y1, y2
		leia (x1, y1)
		leia (x2, y2)
		escreva(m.raiz((m.potencia((x1 - x2), 2) + m.potencia((y1 - y2), 2)), 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 143; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */