package Cap03;

public class ProdutoEx08 {

	public static void main(String[] args) {
		
		ProdutoEx08 p1 = new ProdutoEx08("Televisão", 1000.32);
		ProdutoEx08 p2 = new ProdutoEx08("Geladeira", 500.23);
		
		p1.aplicarDesconto(0.10);
		p2.aplicarDesconto(0.10);
		System.out.println(p1.preco);
		System.out.println(p2.preco);
	}
	
	String nome;
	double preco;
	
	public ProdutoEx08(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void aplicarDesconto(double desconto) {
		this.preco -= (this.preco*desconto);
	}
	

}

