package ProjectJava;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColetaDados {
	Scanner leia = new Scanner(System.in); //cria��o do scanner

	//declara��o dos atributos
	private String nomeCompleto;
	private int idade;
	private int escolhaGenero; //1 para feminino, 2 para masculino, 3 para outros e 4 n�o desejo informar
	private String email;
	private double rendaPerCapita;
	
	//vari�veis tempor�rias para obter os atributos segundo entrada do usu�rio *rever*
	public String a;
	public int b;
	public int c;
	public String d;
	public double e;
	
	//cria��o do construtor
	public ColetaDados (String nomeCompleto, int idade, int escolhaGenero,
			String email, double rendaPerCapita) {
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
		this.escolhaGenero = escolhaGenero;
		this.email = email;
		this.rendaPerCapita = rendaPerCapita;
	}
	
	//fun��o para obter os dados fornecidos para o usu�rio
	public void pegaDados() {
		boolean continueLoop = true;
	    do {
		try {
			   
				System.out.println("\nInsira seu nome completo: ");
				a = leia.nextLine();
				System.out.println("\nInsira sua idade: ");
				b = leia.nextInt();
				
				System.out.println("\nInsira seu g�nero:\n(1 - Feminino, 2 - Masculino,"
						+ " 3 - Outros, 4 - N�o desejo Informar)\n");
				c = leia.nextInt();
				
				System.out.println("\nInsira seu email: ");
				d = leia.next();
				
				System.out.println("\nInsira sua renda per capita familiar: ");
				e = leia.nextDouble();
				continueLoop = false;
				
		
				}
		catch(InputMismatchException inp) {
			leia.nextLine();
			System.out.println("\nEntrada incorreta, insira novamente os dados requisitados!\n");
			
		}
	}while(continueLoop);
	}
	
	//getters and setters
	public int getEscolhaGenero() {
		return escolhaGenero;
	}

	public void setEscolhaGenero(int escolhaGenero) {
		this.escolhaGenero = escolhaGenero;
	}

	public double getRendaPerCapita() {
		return rendaPerCapita;
	}

	public void setRendaPerCapita(double rendaPerCapita) {
		this.rendaPerCapita = rendaPerCapita;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}