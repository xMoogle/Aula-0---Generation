package orientacaoObjeto;

public class InformacoesCliente 
{
	
	public static void main(String[] args) 
	{
			Cliente cliente = new Cliente("Ana", 23, 12345678, 987654321);
			System.out.println("\nnome: " + cliente.getNome() + "\nIdade: "+ cliente.getIdade() + "\nCPF: " + cliente.getCpf()+"\nRG: "+ cliente.getRg());
	}
 
 
}
