package corpo;

import java.util.ArrayList;

public class Questao1 extends Questao
{

	@Override
	public String getEnunciado() 
	{
		return "Questão 01 - Quiz ConscientizaGen\nA Amazônia legal sofre todos os dias com o desmatamento ilegal. A motivação para esse desmatamento podem ser diversos. Entre eles podemos citar\r\n"
				+ "a derrubada de arvores para utilização do solo para agropecuaria e a comercialização de madeira ilegal. Nesse contexto, qual a perda média diaria de arvores da Amazônia legal?";
	}

	@Override
	public ArrayList<String> getAlternativas() 
	{
		ArrayList<String> alternativas = new ArrayList<String>();
		alternativas.add("a) 150");
		alternativas.add("b) 1.500");
		alternativas.add("c) 15.000");
		alternativas.add("d) 150.000 árvores");
		alternativas.add("e) 1.500.000 árvores");
		return alternativas;
	}

	@Override
	public String getAlternativaCorreta() 
	{
		return "e";
	}

	@Override
	public String getFeedbackC() 
	{
		return "Resposta correta! "
				+ "\nDe acordo com com o painel Plena Mata só este ano foram desmatadas mais de 474,8 milhões de arvores na região da amazônia legal \n \n";
	}

	@Override
	public String getFeedbackE() 
	{
		return "\nResposta incorreta!\nPode parecer assustador, mas é muito mais! Tente novamente";
	}

}
