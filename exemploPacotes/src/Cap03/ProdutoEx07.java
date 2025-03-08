package Cap03;

public class ProdutoEx07 {

	public static void main(String[] args ){
		ProdutoEx07 p1 = new ProdutoEx07("Televisão", 1000.32);
		ProdutoEx07 p2 = new ProdutoEx07("Geladeira", 500.23);
		
		System.out.printf("Nome do produto 1: %s %nPreço do produto 1: %.2f", p1.nome, p1.preco);
		System.out.printf("Nome do produto 2: %s %nPreço do produto 2: %.2f", p2.nome, p2.preco);
	}
	
	String nome;
	double preco;
	
	public ProdutoEx07(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
}

