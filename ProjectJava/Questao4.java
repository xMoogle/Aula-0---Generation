package ProjectJava;

import java.util.ArrayList;

public class Questao4 extends Questao 
{
	@Override
	public String getEnunciado() 
	{
		return "Quest�o 04 - Quiz ConscientizaGen\nQual a porcentagem de pagamento das multas ambientais cobradas no Brasil?";
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
		return "Resposta correta! "+"Em um relat�rio entregue ao Tribunal de Contas da Uni�o (TCU), constava que de cada 100 reais"
				+ "\nem multas aplicadas pelo Instituto Brasileiro de Meio Ambiente (Ibama), menos e tr�s reais entraram nos caixas.\n\n";
	}

	@Override
	public String getFeedbackE() 
	{
		return "Resposta incorreta! De acordo com os dados do Panorama dos Res�duos s�lidos da Abrelpe o n�mero � ainda maior! \n \n";
	}

}
