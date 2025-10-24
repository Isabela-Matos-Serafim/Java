package lista22;

public class produtoP {

	public static void main(String[] args) {
		produto produto = new produto();
		
		produto.nome = "Camiseta";
		produto.preco = 49.90;
		produto.estoque = 10;
		produto.vender();
		produto.mostrarInformacoes();
		
		produto.nome = "Tênis";
		produto.preco = 199.90;
		produto.estoque = 5;
		produto.vender();
		produto.mostrarInformacoes();

	}

}
