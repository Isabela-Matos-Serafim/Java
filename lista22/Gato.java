package lista22;
public class Gato {
	String nome;
	String raca;
	int idade;
	
	void miar() {
		System.out.println("Miau!");
	}
	
	void comer() {
		System.out.println(nome +" está comendo!");
	}
	
	void mostrarInformacoes() {
		System.out.println(nome +" é da raça "+ raca +" e possui "+ idade + " anos");
	}

}
