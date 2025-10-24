package lista22;
public class FilmeP {

	public static void main(String[] args) {
		Filme filme = new Filme();
		
		filme.titulo = "Inception";
		filme.genero = "Ficção Científica";
		filme.duracao = 148.4;
		filme.assistir();
		filme.mostrarInformacoes();
		
		filme.titulo = "Titanic";
		filme.genero = "Romance";
		filme.duracao = 195.1;
		filme.assistir();
		filme.mostrarInformacoes();
		
		filme.titulo = "Avengers: Endgame";
		filme.genero = "Ação";
		filme.duracao = 181;
		filme.assistir();
		filme.mostrarInformacoes();

	}

}
