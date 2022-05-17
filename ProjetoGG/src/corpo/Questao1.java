package corpo;

import java.util.ArrayList;

public class Questao1 extends Questao
{

	@Override
	public String getEnunciado() 
	{
		return "Quest�o 01 - Quiz ConscientizaGen\nA Amaz�nia legal sofre todos os dias com o desmatamento ilegal. A motiva��o para esse desmatamento podem ser diversos. Entre eles podemos citar\r\n"
				+ "a derrubada de arvores para utiliza��o do solo para agropecuaria e a comercializa��o de madeira ilegal. Nesse contexto, qual a perda m�dia diaria de arvores da Amaz�nia legal?";
	}

	@Override
	public ArrayList<String> getAlternativas() 
	{
		ArrayList<String> alternativas = new ArrayList<String>();
		alternativas.add("a) 150");
		alternativas.add("b) 1.500");
		alternativas.add("c) 15.000");
		alternativas.add("d) 150.000 �rvores");
		alternativas.add("e) 1.500.000 �rvores");
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
				+ "\nDe acordo com com o painel Plena Mata s� este ano foram desmatadas mais de 474,8 milh�es de arvores na regi�o da amaz�nia legal \n \n";
	}

	@Override
	public String getFeedbackE() 
	{
		return "\nResposta incorreta!\nPode parecer assustador, mas � muito mais! Tente novamente";
	}

}
