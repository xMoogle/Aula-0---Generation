package ProjectJava;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
public class ConscientizaGen 
{

	public static void main(String[] args)  throws IOException
	{ 
		
		System.out.println("Seja bem vindo ao ConscientizaGen! Vamos falar um pouco sobre meio ambiente?");
		// 1o PARTE
				//inicia��o da classe com dados nulos
				//aqui eu crio um objeto tempor�rio s� para poder chamar o m�todo pegaDados, assim obter
				//os dados digitados pelo usu�rio
				ColetaDados dadosTemp = new ColetaDados(null, 0, 0, null, 0);
				
				//cria��o do objeto que de fato representa o usu�rio
				dadosTemp.pegaDados();
				
				//aqui puxamos os dados digitados pelo usu�rio para o objeto que representa ele
				ColetaDados dados1 = new ColetaDados(dadosTemp.a,dadosTemp.b,
						dadosTemp.c,dadosTemp.d,dadosTemp.e);
				
				//provavelmente isso aqui vai ter que ir pro ColetaDados.java
				String genero;
				switch(dados1.getEscolhaGenero()) {
				case 1:
					genero = "feminino";
					break;
				case 2:
					genero = "masculino";
					break;
				case 3:
					genero = "outros";
					break;
					default:
						genero = "n�o quis informar";
						break;
				}
				//Fim da 1a parte
				
				//2a Parte
				perfilusuariosii testaperfil2 = new perfilusuariosii(0);
				
				testaperfil2.menupergunta1();
				testaperfil2.menupergunta2();
				testaperfil2.menupergunta3();
				testaperfil2.menupergunta4();
				testaperfil2.menupergunta5();
				testaperfil2.menupergunta6();
				testaperfil2.menupergunta7();
				testaperfil2.menupergunta8();
				testaperfil2.menupergunta9();
				testaperfil2.menupergunta10();
				testaperfil2.menupergunta11();
				testaperfil2.menupergunta12();
				testaperfil2.menupergunta13();
				// Fim da 2a parte
				
		//Quiz - come�a aqui
				//sauda��es aqui
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
		System.out.println("\n"
			+ "Muito obrigado por executar a aplica��o ConscientizaGen, vers�o 1.0.0.\r\n"
			+ "	Esperamos que sua experi�ncia de usu�rio tenha sido agrad�vel, e que tenhamos adicionado conhecimentos relevantes, tamb�m, � sua experi�ncia cidad�. N�o se esque�a de deixar o seu feedback: ele � muito importante para n�s.\r\n"
			+ "	� muito comum pensarmos que nossas a��es enquanto indiv�duos causam pouco ou nenhum impacto no nosso planeta. No entanto, cada um dos indiv�duos que carrega consigo essa mentalidade se torna parte exatamente do coletivo que causa muitos desses impactos direta ou indiretamente, pela a��o - ou por falta dela.\r\n"
			+ "	Voc� deseja saber mais sobre esse assunto e gostaria de AGIR em prol dessa causa? Acesse www.conscientiza.gen.br e expanda a sua jornada por um mundo mais sustent�vel!\r\n"
			+ "�Goodbye, World!�");
		//Quiz acaba aqui
		
		// FINAL
		
		
				//---------------------------------------
				//PERFIL COMPORTAMENTAL 
				//---------------------------------------
				//EXPLANA��O
				//---------------------------------------
				//QUIZ
				//---------------------------------------
				//CONSCIENTIZA��O
				//---------------------------------------
				
				
				PrintStream fileOut = new PrintStream("./out.txt");
				System.setOut(fileOut);
				System.out.println("RELAT�RIO DADOS 1:\nNome: "+dados1.getNomeCompleto()+
						"\nIdade: "+dados1.getIdade()+"\nGenero: "+genero+"\ne-mail: "+dados1.getEmail()
						+"\nRenda Per Capita Familiar: "+dados1.getRendaPerCapita());
				
				
				//System.out.println("testando, a idade seria: "+dados1.getIdade()); //caso queira testar
	}
}
