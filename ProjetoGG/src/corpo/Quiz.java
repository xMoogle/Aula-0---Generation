package corpo;

public class Quiz 
{

	public static void main(String[] args) 
	{
		Questao1 questao1 = new Questao1();
		Questao2 questao2 = new Questao2();
		Questao3 questao3 = new Questao3();
		Questao4 questao4 = new Questao4();
		Questao5 questao5 = new Questao5();
		
		questao1.execute();
		questao2.execute();
		questao3.execute();
		questao4.execute();
		questao5.execute();
		questao5.encerramento();
	}
}
