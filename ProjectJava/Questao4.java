package ProjectJava;

import java.util.ArrayList;

public class Questao4 extends Questao 
{
	@Override
	public String getEnunciado() 
	{
		return "Questão 04 - Quiz ConscientizaGen\nQual a porcentagem de pagamento das multas ambientais cobradas no Brasil?";
	}

	@Override
	public ArrayList<String> getAlternativas() 
	{   
		ArrayList<String> alternativas = new ArrayList<String>();
		alternativas.add("a) 70% de pagamento efetuado.");
		alternativas.add("b) 50% de pagamento efetuado.");
		alternativas.add("c) 30% de pagamento efetuado.");
		alternativas.add("d) 9% de pagamento efetuado.");
		alternativas.add("e) 3% de pagamento efetuado.");
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
		return "Resposta correta! "+"Em um relatório entregue ao Tribunal de Contas da União (TCU), constava que de cada 100 reais"
				+ "\nem multas aplicadas pelo Instituto Brasileiro de Meio Ambiente (Ibama), menos e três reais entraram nos caixas.\n\n";
	}

	@Override
	public String getFeedbackE() 
	{
		return "Resposta incorreta! De acordo com os dados do Panorama dos Resíduos sólidos da Abrelpe o número é ainda maior! \n \n";
	}

}
