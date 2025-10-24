package lista22;
public class Filme {
	
	String titulo;
	String genero;
	double duracao;
	
	void assistir() {
		System.out.println("Assistindo " + titulo);
	}
	
	void mostrarInformacoes() {
		System.out.println(titulo +" é do genero " + genero + " e dura " + duracao);
	}

}
