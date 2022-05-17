package corpo;

import java.util.ArrayList;

public class Questao3 extends Questao 
{
	@Override
	public String getEnunciado() 
	{
		return "Questão 03 - Quiz ConscientizaGen\nQual a porcentagem de municípios brasileiros que apresentam problemas ambientais? ";
	}

	@Override
	public ArrayList<String> getAlternativas() 
	{   
		ArrayList<String> alternativas = new ArrayList<String>();
		alternativas.add("a) 50%.");
		alternativas.add("b) 25%.");
		alternativas.add("c) 19%.");
		alternativas.add("d) 90%.");
		alternativas.add("e) 97%.");
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
		return "Resposta correta! "
				+ "De acordo com uma pesquisa realizada pelo Instituto Brasileiro de Geografia e Estatística (IBGE), "
				+ "\n90% dos municípios brasileiros apresentam problemas ambientais, e entre os mais relatados estão as queimadas, desmatamento e assoreamento. \n \n";
	}

	@Override
	public String getFeedbackE() 
	{
		return "Resposta incorreta! De acordo com uma pesquisa realizada pelo Instituto Brasileiro de Geografia e Estatística (IBGE),"
				+ "\n90% dos municípios brasileiros apresentam problemas ambientais, e entre os mais relatados estão as queimadas, desmatamento e assoreamento. \n \n";
	}

}
