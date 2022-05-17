package ProjectJava;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
public class ConscientizaGen 
{

	public static void main(String[] args)  throws IOException
	{
		// 1o PARTE
				//iniciação da classe com dados nulos
				//aqui eu crio um objeto temporário só para poder chamar o método pegaDados, assim obter
				//os dados digitados pelo usuário
				ColetaDados dadosTemp = new ColetaDados(null, 0, 0, null, 0);
				
				//criação do objeto que de fato representa o usuário
				dadosTemp.pegaDados();
				
				//aqui puxamos os dados digitados pelo usuário para o objeto que representa ele
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
						genero = "não quis informar";
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
				
		//Quiz - começa aqui
				//saudações aqui
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
		//Quiz acaba aqui
		
		// FINAL
		
		
				//---------------------------------------
				//PERFIL COMPORTAMENTAL 
				//---------------------------------------
				//EXPLANAÇÃO
				//---------------------------------------
				//QUIZ
				//---------------------------------------
				//CONSCIENTIZAÇÃO
				//---------------------------------------
				
				
				PrintStream fileOut = new PrintStream("./out.txt");
				System.setOut(fileOut);
				System.out.println("RELATÓRIO DADOS 1:\nNome: "+dados1.getNomeCompleto()+
						"\nIdade: "+dados1.getIdade()+"\nGenero: "+genero+"\ne-mail: "+dados1.getEmail()
						+"\nRenda Per Capita Familiar: "+dados1.getRendaPerCapita());
				
				
				//System.out.println("testando, a idade seria: "+dados1.getIdade()); //caso queira testar
	}
}
