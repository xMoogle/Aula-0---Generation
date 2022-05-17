package ProjectJava;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class perfilusuariosii 
{
	public perfilusuariosii(int opcao)
	{
		
	}
	
	 public void menupergunta1()
	    {
	    	int opcao = 0;
	    	boolean continueLoop = true;
	    	Scanner leia = new Scanner(System.in);
	    	do
	    	{
	    		try
	    		{
	    			System.out.println("\nComo você limpa o carro, o quintal ou a sua calçada? \n1)Com uma mangueira. \n2)Com um balde. \n0)Sair do programa.");
	    			opcao = leia.nextInt();
	    			continueLoop = false;
	    		}
	    		catch(InputMismatchException inputMismatchException)
	    		{
	    			System.out.println("\nOpção Inválida!");
	    			menupergunta1();
	    		}
	    		switch(opcao)
	    		{
	    		case 0:
	    			System.out.println("Agradecemos por utilizar o nosso sistema!");
	    		    System.exit(0);
	    		case 1: 
	    			System.out.println("\nCuidado! A mangueira desperdiça muita água! Evite o uso.");
	    			break;
	    		case 2:
	    			System.out.println("\nMuito bem! Evite o uso de mangueiras e diminua o desperdício de água.");
	    		    break;
	    			default:
	    				System.out.println("\nOpção inválida!");
	    				menupergunta1();
	    		}
	    		
	    	}
	    	while(continueLoop);
	    }
	    
	
	public void menupergunta2()
	    {
	    	int opcao = 0;
	    	boolean continueLoop = true;
	    	Scanner leia = new Scanner(System.in);
	    	do
	    	{
	    		try
	    		{
	    			System.out.println("\nJá verificou se sua casa possui vazamentos? \n1)Não possui vazamentos! \n2)Possui vazamentos. \n0)Sair do programa.");
	    			opcao = leia.nextInt();
	    			continueLoop = false;
	    		}
	    		catch(InputMismatchException inputMismatchException)
	    		{
	    			System.out.println("\nOpção Inválida!");
	    			menupergunta2();
	    		}
	    		switch(opcao)
	    		{
	    		case 0:
	    			System.out.println("Volte ao menu principal");
	    		    System.exit(0);
	    		case 1: 
	    			System.out.println("\nQue bom! Continue realizando a manutenção preventiva do sistema hidráulico.");
	    			break;
	    		case 2:
	    			System.out.println("\nAnote! Realizar a manutenção preventiva do sistema hidráulico pode ajudar a reduzir desperdícios!");
	    		    break;
	    			default:
	    				System.out.println("\nOpção inválida!");
	    				menupergunta2();
	    		}
	    		
	    	}
	    	while(continueLoop);
	    }  
	
	public void menupergunta3()
	    {
	    	int opcao = 0;
	    	boolean continueLoop = true;
	    	Scanner leia = new Scanner(System.in);
	    	do
	    	{
	    		try
	    		{
	    			System.out.println("\nVocê dirige? \n1)Sim. 2)Não. \n0)Sair do programa.");
	    			opcao = leia.nextInt();
	    			continueLoop = false;
	    		}
	    		catch(InputMismatchException inputMismatchException)
	    		{
	    			System.out.println("\nOpção Inválida!");
	    			menupergunta3();
	    		}
	    		switch(opcao)
	    		{
	    		case 0:
	    			System.out.println("Volte ao menu principal");
	    		    System.exit(0);
	    		case 1: 
	    			System.out.println("\nLegal! Lembre-se de dar preferência por veículos movidos a álcool ou a biocombustíveis! Além disso, ofereça carona aos seus colegas.");
	    			break;
	    		case 2:
	    			System.out.println("\nCaso um dia você precise escolher algum veículo, opte por modelos movidos a álcool ou a biocombustíveis.");
	    		    break;
	    			default:
	    				System.out.println("\nOpção inválida!");
	    				menupergunta3();
	    		}
	    		
	    	}
	    	while(continueLoop);
	    }
	
	public void menupergunta4()
	    {
	    	int opcao = 0;
	    	boolean continueLoop = true;
	    	Scanner leia = new Scanner(System.in);
	    	do
	    	{
	    		try
	    		{
	    			System.out.println("\nVocê costuma sobrecarregar tomadas, conectando vários aparelhos ao mesmo tempo? \n1)Confesso que sim. \n2)Não, tomo cuidado. \n0)Sair do programa.");
	    			opcao = leia.nextInt();
	    			continueLoop = false;
	    		}
	    		catch(InputMismatchException inputMismatchException)
	    		{
	    			System.out.println("\nOpção Inválida!");
	    			menupergunta4();
	    		}
	    		switch(opcao)
	    		{
	    		case 0:
	    			System.out.println("Volte ao menu principal");
	    		    System.exit(0);
	    		case 1: 
	    			System.out.println("\nCuidado! Os fios podem aquecer. Além disso, o consumo irá aumentar (consequentemente, sua conta de luz também)!");
	    			break;
	    		case 2:
	    			System.out.println("\nUfa! Você está evitando vários problemas, como o aquecimento dos fios e o aumento do consumo de energia.");
	    		    break;
	    			default:
	    				System.out.println("\nOpção inválida!");
	    				menupergunta4();
	    		}
	    		
	    	}
	    	while(continueLoop);
	    }
	
	 public void menupergunta5()
	    {
	    	int opcao = 0;
	    	boolean continueLoop = true;
	    	Scanner leia = new Scanner(System.in);
	    	do
	    	{
	    		try
	    		{
	    			System.out.println("\nQual o modelo das suas lâmpadas? \n1)Incandescente. \n2)Fluorescente. \n3)LED. \n0)Sair do programa.");
	    			opcao = leia.nextInt();
	    			continueLoop = false;
	    		}
	    		catch(InputMismatchException inputMismatchException)
	    		{
	    			System.out.println("\nOpção Inválida!");
	    			menupergunta5();
	    		}
	    		switch(opcao)
	    		{
	    		case 0:
	    			System.out.println("Volte ao menu principal");
	    		    System.exit(0);
	    		case 1: 
	    			System.out.println("\nSabia que se a sua lâmpada for substituída por um modelo de LED, haverá um gasto de 75% a menos de energia? Além disso, a durabilidade será maior!");
	    			break;
	    		case 2:
	    			System.out.println("\nSabia que se a sua lâmpada for substituída por um modelo de LED, haverá um gasto de 75% a menos de energia? Além disso, a durabilidade será maior!");
	    		    break;
	    		case 3:
	    			System.out.println("\nParabens! Você está economizando energia e prolongando a vida util da sua lâmpada, pois as lampadas de LED são mais eficientes energeticamente.");
	    		    break;
	    			default:
	    				System.out.println("\nOpção inválida!");
	    				menupergunta5();
	    		}
	    		
	    	}
	    	while(continueLoop);
	    }
	
	public void menupergunta6()
	    {
	    	int opcao = 0;
	    	boolean continueLoop = true;
	    	Scanner leia = new Scanner(System.in);
	    	do
	    	{
	    		try
	    		{
	    			System.out.println("\nVocê utiliza sacolas plásticas?? \n1)Sim, acho prático. \n2)Prefiro sacolas reutilizáveis. \n0)Sair do programa.");
	    			opcao = leia.nextInt();
	    			continueLoop = false;
	    		}
	    		catch(InputMismatchException inputMismatchException)
	    		{
	    			System.out.println("\nOpção Inválida!");
	    			menupergunta6();
	    		}
	    		switch(opcao)
	    		{
	    		case 0:
	    			System.out.println("Volte ao menu principal");
	    		    System.exit(0);
	    		case 1: 
	    			System.out.println("\nSabia que as sacolas plásticas são as principais causadoras de entupimento nas passagens de água nos bueiros e córregos? Além disso, são responsáveis pela poluição de mares e rios, prejudicando a vida dos animais.");
	    			break;
	    		case 2:
	    			System.out.println("\nParabéns! Você está evitando o entupimento nas passagens de água nos bueiros e córregos, além de poupar a vida dos animais que vivem nos mares e rios.");
	    		    break;
	    			default:
	    				System.out.println("\nOpção inválida!");
	    				menupergunta6();
	    		}
	    		
	    	}
	    	while(continueLoop);
	    }
	
	public void menupergunta7()
    {
    	int opcao = 0;
    	boolean continueLoop = true;
    	Scanner leia = new Scanner(System.in);
    	do
    	{
    		try
    		{
    			System.out.println("\nVocê utiliza copos descartáveis? \n1)Sim. \n2)Não, carrego meu próprio copo. \n0)Sair do programa.");
    			opcao = leia.nextInt();
    			continueLoop = false;
    		}
    		catch(InputMismatchException inputMismatchException)
    		{
    			System.out.println("\nOpção Inválida!");
    			menupergunta7();
    		}
    		switch(opcao)
    		{
    		case 0:
    			System.out.println("Volte ao menu principal");
    		    System.exit(0);
    		case 1: 
    			System.out.println("\nQue pena! Aqui vão alguns motivos para você deixar de usar:  não são biodegradáveis, utilizam muita água e energia em sua produção, são prejudiciais à saúde e difíceis de serem reciclados.");
    			break;
    		case 2:
    			System.out.println("\nExcelente escolha! Os copos descartáveis não são biodegradáveis, são difíceis de serem reciclados e ainda podem fazer mal à sua saúde!");
    		    break;
    			default:
    				System.out.println("\nOpção inválida!");
    				menupergunta7();
    		}
    		
    	}
    	while(continueLoop);
    }
	
	public void menupergunta8()
    {
    	int opcao = 0;
    	boolean continueLoop = true;
    	Scanner leia = new Scanner(System.in);
    	do
    	{
    		try
    		{
    			System.out.println("\nQuanto tempo dura o seu banho? \n1)Até 5 minutos. \n2)Mais de 5 minutos. \n0)Sair do programa.");
    			opcao = leia.nextInt();
    			continueLoop = false;
    		}
    		catch(InputMismatchException inputMismatchException)
    		{
    			System.out.println("\nOpção Inválida!");
    			menupergunta8();
    		}
    		switch(opcao)
    		{
    		case 0:
    			System.out.println("Volte ao menu principal");
    		    System.exit(0);
    		case 1: 
    			System.out.println("\nVocê está de acordo com as recomendações da Organização Mundial da Saúde!");
    			break;
    		case 2:
    			System.out.println("\nRepense a sua conduta! O tempo recomendado pela Organização Mundial da Saúde é de 5 minutos (por questões de saúde e de sustentabilidade).");
    		    break;
    			default:
    				System.out.println("\nOpção inválida!");
    				menupergunta8();
    		}
    	}
    	while(continueLoop);
    }
	
    public void menupergunta9()
    {
    	int opcao = 0;
    	boolean continueLoop = true;
    	Scanner leia = new Scanner(System.in);
    	do
    	{
    		try
    		{
    			System.out.println("\nVocê separa o lixo da sua casa? \n1)Sim. \n2)Não. \n0 Sair");
    			opcao = leia.nextInt();
    			continueLoop = false;
    		}
    		catch(InputMismatchException inputMismatchException)
    		{
    			System.out.println("\nOpção Inválida!");
    			menupergunta9();
    		}
    		switch(opcao)
    		{
    		case 0:
    			System.out.println("Volte ao menu principal");
    		    System.exit(0);
    		case 1: 
    			System.out.println("\nQue bom! Você ja esta ajudando o planeta de alguma forma, parabéns!");
    			break;
    		case 2:
    			System.out.println("\nVoce sabia que cerca de 180 mil toneladas de resíduos sólidos são recolhidos no Brasil diariamente? E que mais da metade desses resíduos não conseguem ser reaproveitados devido aà contaminação e que são gastos mais ou menos R$ 8 bilhões por ano em aterros para esconder esse lixo?");
    		    break;
    			default:
    				System.out.println("\nOpção inválida!");
    				menupergunta9();
    		}
    		
    	}
    	while(continueLoop);
    }
    
    public void menupergunta10()
    {
    	int opcao = 0;
    	boolean continueLoop = true;
    	Scanner leia = new Scanner(System.in);
    	do
    	{
    		try
    		{
    			System.out.println("\nQuando está fora de casa, você costuma jogar o lixo na rua, guarda ou joga na lixeira mais próxima? \n1)Jogo na rua. \n2)Guardo no bolso. \n3Jogo na lixeira mais próxima. \n0Sair");
    			opcao = leia.nextInt();
    			continueLoop = false;
    		}
    		catch(InputMismatchException inputMismatchException)
    		{
    			System.out.println("\nOpção Inválida!");
    			menupergunta10();
    		}
    		switch(opcao)
    		{
    		case 0:
    			System.out.println("Agradecemos por utilizar o nosso sistema!");
    		    System.exit(0);
    		case 1:
    			System.out.println("Que pena! Uma das maiores causa de enchentes nas cidades brasileiras é o entupimento dos bueiros e esgotos pela grande quantidade de lixo que se acumula nesses caminhos de escoamento de água. Além de que o lixo também pode seguir o fluxo dos rios e poluir o mesmo.");
    		    break;
    		case 2: 
    			System.out.println("\nMenos mal! É ideal quando chegar em casa jogar no lixo adequado.");
    			break;
    		case 3:
    			System.out.println("\nQue bom! Você ja esta ajudando o planeta de alguma forma, parabéns!");
    		    break;
    			default:
    				System.out.println("\nOpção inválida!");
    				menupergunta10();
    		}
    	}
    	while(continueLoop);
    }
    
    public void menupergunta11()
    {
    	int opcao = 0;
    	boolean continueLoop = true;
    	Scanner leia = new Scanner(System.in);
    	do
    	{
    		try
    		{
    			System.out.println("\nVocê costuma descartar pilha, baterias e eletrônicos, sabe como fazer o descarte de forma correta? \n1)Não, deixo guardado em casa. \n2)Eu jogo no lixo normal mesmo. \n3)Sim, descarto nos postos de coleta que costumam ficar em grandes supermercados e shoppings. \n0Sair");
    			opcao = leia.nextInt();
    			continueLoop = false;
    		}
    		catch(InputMismatchException inputMismatchException)
    		{
    			System.out.println("\nOpção Inválida!");
    			menupergunta11();
    		}
    		switch(opcao)
    		{
    		case 0:
    			System.out.println("Agradecemos por utilizar o nosso sistema!");
    		    System.exit(0);
    		case 1:
    			System.out.println("\nQue pena!As baterias, pilhas e eletrônicos possuem metais pesados em sua composição. Os metais são muito tóxicos para o meio ambiente e contaminam o solo e os lençóis freáticos além de ser prejudiciais para a saúde humana quando guardados dentro de casa também.");
    		    break;
    		case 2: 
    			System.out.println("\nQue pena!As baterias, pilhas e eletrônicos possuem metais pesados em sua composição. Os metais são muito tóxicos para o meio ambiente e contaminam o solo e os lençóis freáticos além de ser prejudiciais para a saúde humana quando guardados dentro de casa também.");
    			break;
    		case 3:
    			System.out.println("\nQue bom! Você ja esta ajudando o planeta de alguma forma, parabéns!");
    		    break;
    			default:
    				System.out.println("\nOpção inválida!");
    				menupergunta11();
    		}
    	}
    	while(continueLoop);
    }
    
    public void menupergunta12()
    {
    	int opcao = 0;
    	boolean continueLoop = true;
    	Scanner leia = new Scanner(System.in);
    	do
    	{
    		try
    		{
    			System.out.println("\nOs remédios e suas embalagens, você costuma descartar onde? \n1)No lixo normal, nunca pensei em descartar em outro lugar. \n2)Descarto no lixo reciclável. \n3)Faço o descarte correto em locais de coleta. \n0Sair");
    			opcao = leia.nextInt();
    			continueLoop = false;
    		}
    		catch(InputMismatchException inputMismatchException)
    		{
    			System.out.println("\nOpção Inválida!");
    			menupergunta12();
    		}
    		switch(opcao)
    		{
    		case 0:
    			System.out.println("Agradecemos por utilizar o nosso sistema!");
    		    System.exit(0);
    		case 1:
    			System.out.println("\nQue pena!Os resíduos de remédios e afins não podem ser descartados em lixo normal por ainda restarem substâncias dos produtos nas embalagens, ao entrar em contato com o solo ou a água esses componentes podem afetar a vida do ecossistema ao redor como é o caso dos peixes que podem ter sua reprodução prejudicada ao entrar em contato com certas substancias encontradas em remédios para humanos. Drogarias e a vigilância sanitária costumam recolher ou ter algum lugar de referência para o descarte correto desses resíduos.");
    		    break;
    		case 2: 
    			System.out.println("\nQuase lá,pelo menos você está tentando mudar hábitos!Os resíduos de remédios e afins não podem ser descartados em lixo normal por ainda restarem substâncias dos produtos nas embalagens, ao entrar em contato com o solo ou a água esses componentes podem afetar a vida do ecossistema ao redor como é o caso dos peixes que podem ter sua reprodução prejudicada ao entrar em contato com certas substancias encontradas em remédios para humanos. Drogarias e a vigilância sanitária costumam recolher ou ter algum lugar de referência para o descarte correto desses resíduos.");
    			break;
    		case 3:
    			System.out.println("\nQue bom! Você ja esta ajudando o planeta de alguma forma, parabéns!");
    		    break;
    			default:
    				System.out.println("\nOpção inválida!");
    				menupergunta12();
    		}
    	}
    	while(continueLoop);
    }
    
    public void menupergunta13() throws IOException
    {
    	int opcao = 0;
    	boolean continueLoop = true;
    	Scanner leia = new Scanner(System.in);
    	do
    	{
    		try
    		{
    			System.out.println("\nVoce tem o hábito de desperdiçar comida, ou deixar aquele famoso restinho ou jogar fora aquele alimento que parece feio? \n1)Sim, é algo automático. \n2)Não, eu reutilizo ao máximo. \n0Sair");
    			opcao = leia.nextInt();
    			continueLoop = false;
    		}
    		catch(InputMismatchException inputMismatchException)
    		{
    			System.out.println("\nOpção Inválida!");
    			menupergunta13();
    		}
    		switch(opcao)
    		{
    		case 0:
    			System.out.println("Agradecemos por utilizar o nosso sistema!");
    		    System.exit(0);
    		case 1: 
    			System.out.println("\nQue pena!Você sabia que o brasileiro joga fora mais de 40 quilos de comida por dia? Esse desperdício anual pode chegar a 8,7 milhões de toneladas no país, o que daria para alimentar 13 milhões de pessoas! E não só isso, quer dizer também que todos os recursos usados para produzir esses alimentos são desperdiçados também.");
    			break;
    		case 2:
    			System.out.println("\nQue bom! Você ja esta ajudando o planeta de alguma forma, parabéns!");
    		    break;
    			default:
    				System.out.println("\nOpção inválida!");
    				menupergunta13();
    		}
    	}
    	while(continueLoop);
    	System.out.println("\n\nAgora que você já traçou seu perfil de hábitos do dia a dia, preparamos para você um quiz para testar seus conhecimentos em relação ao quanto você conhece sobre os impactos ambientais.\n");
    	System.out.println("\nInsira qualquer letra e tecle enter pra continuar...");
    	String a;
    	a = leia.next();
    }
    }
