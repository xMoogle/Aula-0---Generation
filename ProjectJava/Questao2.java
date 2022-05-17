package ProjectJava;

import java.util.ArrayList;

public class Questao2 extends Questao
{
	 

	@Override
	public String getEnunciado() 
	{
		return "Questão 02 - Quiz ConscientizaGen\nA produção de lixo é inevitavel na forma como a nossa sociedade se organiza. A geração de resíduos sólidos vem aumentando no Brasil ao longo dos anos.\r\n"
				+ "Os dados mais recentes de geração destes resíduos aponta que em 2018, no Brasil,  foram geradas:";
	}

	@Override
	public ArrayList<String> getAlternativas() 
	{   
		ArrayList<String> alternativas = new ArrayList<String>();
		alternativas.add("a) 7,9 toneladas");
		alternativas.add("b) 79 toneladas");
		alternativas.add("c) 79 mil toneladas");
		alternativas.add("d) 79 milhões de toneladas");
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
				+ "De acordo com os dados do Panorama dos Resíduos sólidos da Abrelpe foram geradas 79 milhões de toneladas de resíduos sólidos urbanos,\n"
				+ "um aumento de pouco menos de 1% em relação ao ano anterior.\n\n";
	}

	@Override
	public String getFeedbackE() 
	{
		return "\nResposta incorreta!\nDe acordo com os dados do Panorama dos Resíduos sólidos da Abrelpe o número é ainda maior! Tenta novamente!";
	}

}