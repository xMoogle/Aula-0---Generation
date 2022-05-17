package tarefas;

public class Testando 
{
	public static void main(String[] args)
	{
		Cachorro cao = new Cachorro("bob", 3, "andar");
		Cavalo cavalo = new Cavalo("pé de pano", 3, "andar");
		Preguica preguica = new Preguica("Mat", 4, "subir");
		cao.imprimir();
		System.out.println("Tipo de locomocao: "+cao.getMovimentacao());
		cavalo.imprimir();
		System.out.println("tipo de locomocao: "+cavalo.getMovimentacao());
		preguica.imprimir();
		System.out.println("tipo de locomocao: "+preguica.getMovimentacao());
		cao.emitirSom();
		preguica.emitirSom();
		cavalo.emitirSom();

 
}
}
