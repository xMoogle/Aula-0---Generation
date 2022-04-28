programa
{
	
	funcao inicio()
	{
		inteiro horas, minutos, segundos, tempo
		leia (tempo)
		horas = tempo/3600
		minutos = (tempo - horas * 3600)/60
		segundos = (tempo - horas * 3600 - minutos*60)
		escreva( horas, "h", minutos, "m", segundos, "s")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 213; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */