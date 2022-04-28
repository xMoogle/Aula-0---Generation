programa
{
	
	funcao inicio()
	{
		inteiro dias, ano, mes, dia
		leia (dias)
		ano = dias/365
		mes = (dias - ano * 365)/30
		dia = (dias - ano * 365 - mes*30)
		escreva("ano(s) :", ano, "\tmês(es) :", mes, "\tdia(s) :", dia)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 237; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */