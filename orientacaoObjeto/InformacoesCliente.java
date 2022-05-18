package orientacaoObjeto;

public class InformacoesCliente 
{
	
	public static void main(String[] args) 
	{
			Cliente cliente = new Cliente("Ana", 23, 12345678, 987654321);
			System.out.println("\nnome: " + cliente.getNome() + "\nIdade: "+ cliente.getIdade() + "\nCPF: " + cliente.getCpf()+"\nRG: "+ cliente.getRg());
			Aviao aviao = new Aviao("militar", "F45", 145);
			System.out.println("\n\nAvi�o "+ aviao.getTipo()+" cujo moodelo � "+aviao.getNome()+" com o c�digo "+aviao.getNumeroDoModelo());
			ProdutoEletronico memoria = new ProdutoEletronico("Mem�ria RAM", 250.00, 1234, 240);
			System.out.println("\n\nNome " +memoria.getNome() +"\nModelo: "+ memoria.getID()+"\nPre�o: "+memoria.getPreco()+"\nDisponivel: "+memoria.getQtd());
	}
 
    
}
