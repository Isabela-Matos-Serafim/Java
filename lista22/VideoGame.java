package lista22;
public class VideoGame {
	
	String marca;
	String modelo;
	Boolean ligado;
	
	void ligar() {
		ligado = true;
		System.out.println("O console está ligado");
	}
	void desligar() {
		ligado = false;
		System.out.println("O console está desligado");
	}
	
	void verificarStatus() {
		if(ligado = true) {
			System.out.println("O console está ligado");
		}else {
			System.out.println("O console está desligado");
		}
	}

}
