package ProjectJava;

import java.util.ArrayList;

public class Questao2 extends Questao
{
	 

	@Override
	public String getEnunciado() 
	{
		return "Quest�o 02 - Quiz ConscientizaGen\nA produ��o de lixo � inevitavel na forma como a nossa sociedade se organiza. A gera��o de res�duos s�lidos vem aumentando no Brasil ao longo dos anos.\r\n"
				+ "Os dados mais recentes de gera��o destes res�duos aponta que em 2018, no Brasil,  foram geradas:";
	}

	@Override
	public ArrayList<String> getAlternativas() 
	{   
		ArrayList<String> alternativas = new ArrayList<String>();
		alternativas.add("a) 7,9 toneladas");
		alternativas.add("b) 79 toneladas");
		alternativas.add("c) 79 mil toneladas");
		alternativas.add("d) 79 milh�es de toneladas");
		alternativas.add("e) 7 toneladas");
		return alternativas;
	}
	
	@Override
	public String getAlternativaCorreta() 
	{
		return "d";
	}
	
	@Override
	public String getFeedbackC() 
	{
		return "\nResposta correta!\n"
				+ "De acordo com os dados do Panorama dos Res�duos s�lidos da Abrelpe foram geradas 79 milh�es de toneladas de res�duos s�lidos urbanos,\n"
				+ "um aumento de pouco menos de 1% em rela��o ao ano anterior.\n\n";
	}

	@Override
	public String getFeedbackE() 
	{
		return "\nResposta incorreta!\nDe acordo com os dados do Panorama dos Res�duos s�lidos da Abrelpe o n�mero � ainda maior! Tenta novamente!";
	}

}