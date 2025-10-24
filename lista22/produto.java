package lista22;
public class produto {
	
	String nome;
	double preco;
	int estoque;
	
	void vender() {
		if(estoque > 1) {
			estoque --;
		}else {
			System.out.println("Estoque insuficiente");
		}
	}
	
	void mostrarInformacoes() {
		System.out.println("O produto " + nome +" custa "+ preco +" e temos "+ estoque);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
