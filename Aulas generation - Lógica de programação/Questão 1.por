programa
{
	
	funcao inicio()
	{
		real salario, acumulador1, acumulador2, maior, podio
		inteiro nf, x
		acumulador1 = 0
		acumulador2 = 0
		maior = 0
		podio = 0
		para(x=1; x <= 20; x++)
		{
		escreva("\ninsira o salário : ")
		leia(salario)
		escreva("insira o numero de filhos : " )
		leia(nf)
		acumulador1 += salario
		se (salario > podio)
		{
			podio = nf
		}
		se (salario <= 100)
		{
		   acumulador2++	
	     }
		}
		real media, percentual
		
		escreva( "\nMédia de filhos : ", acumulador1/20)
		escreva("\nMaior salário : ",maior )
		escreva("\nPercentual de pessoas com salário até R$ 100,00 : ", (acumulador2*100)/20, " %")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 490; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */