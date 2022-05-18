package orientacaoObjeto;

public class InformacoesCliente 
{
	
	public static void main(String[] args) 
	{
			Cliente cliente = new Cliente("Ana", 23, 12345678, 987654321);
			System.out.println("\nnome: " + cliente.getNome() + "\nIdade: "+ cliente.getIdade() + "\nCPF: " + cliente.getCpf()+"\nRG: "+ cliente.getRg());
			Aviao aviao = new Aviao("militar", "F45", 145);
			System.out.println("\n\nAvião "+ aviao.getTipo()+" cujo moodelo é "+aviao.getNome()+" com o código "+aviao.getNumeroDoModelo());
			ProdutoEletronico memoria = new ProdutoEletronico("Memória RAM", 250.00, 1234, 240);
			System.out.println("\n\nNome " +memoria.getNome() +"\nModelo: "+ memoria.getID()+"\nPreço: "+memoria.getPreco()+"\nDisponivel: "+memoria.getQtd());
	}
 
    
}
