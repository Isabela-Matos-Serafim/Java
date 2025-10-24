package lista22;
public class musica {

	String titulo;
	String artista;
	double duracao;
	
	void tocar() {
		System.out.println("Tocando " + titulo + " de " + artista);
	}
	void pausar() {
		System.out.println("Musica pausada");
	}
	void mostrarDetalhes() {
		System.out.println(titulo + artista + duracao);
	}
}
