package corpo;

import java.util.ArrayList;

public class Questao5 extends Questao
{
	@Override
	public String getEnunciado() 
	{
		return "Questão 05 - Quiz ConscientizaGen\nQual a porcentagem de cidades brasileiras que despejam o seu lixo produzido em aterros sanitários?";
	}

	@Override
	public ArrayList<String> getAlternativas() 
	{   
		ArrayList<String> alternativas = new ArrayList<String>();
		alternativas.add("a) 100% das cidades.");
		alternativas.add("b) 80% das cidades.");
		alternativas.add("c) mais de 50% das cidades");
		alternativas.add("d) 40% das cidades.");
		alternativas.add("e) menos de 30% das cidades.");
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
				+ "\nDe acordo com dados da Pesquisa de Saneamento Básico do Instituto Brasileiro de Geografia e Estatística (IBGE), realizada em 2008, somente"
				+ "\n28% das cidades possuíam aterros sanitários, e mais de 50% delas despejavam o lixo produzido em lixões. \n \n";
	}

	@Override
	public String getFeedbackE() 
	{
		return "Resposta incorreta! De acordo com dados da Pesquisa de Saneamento Básico do IBGE, apenas 28% das cidades possuíam aterros sanitários,"
				+ "\ne mais de 50% delas despejavam o lixo produzido em lixões. \n";
	}

}
