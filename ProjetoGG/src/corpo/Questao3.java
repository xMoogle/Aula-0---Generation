package corpo;

import java.util.ArrayList;

public class Questao3 extends Questao 
{
	@Override
	public String getEnunciado() 
	{
		return "Quest�o 03 - Quiz ConscientizaGen\nQual a porcentagem de munic�pios brasileiros que apresentam problemas ambientais? ";
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
				+ "De acordo com uma pesquisa realizada pelo Instituto Brasileiro de Geografia e Estat�stica (IBGE), "
				+ "\n90% dos munic�pios brasileiros apresentam problemas ambientais, e entre os mais relatados est�o as queimadas, desmatamento e assoreamento. \n \n";
	}

	@Override
	public String getFeedbackE() 
	{
		return "Resposta incorreta! De acordo com uma pesquisa realizada pelo Instituto Brasileiro de Geografia e Estat�stica (IBGE),"
				+ "\n90% dos munic�pios brasileiros apresentam problemas ambientais, e entre os mais relatados est�o as queimadas, desmatamento e assoreamento. \n \n";
	}

}
