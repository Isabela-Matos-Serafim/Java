package lista22;
public class musicaP {

	public static void main(String[] args) {
		musica musica = new musica();
		
		 musica.titulo = "Bohemian Rhapsody";
	     musica.artista = "Queen";
	     musica.duracao = 6.7;
	     musica.tocar();
	     musica.pausar();
	     musica.mostrarDetalhes();
	     
	     musica.titulo = "Shape of You";
	     musica.artista = "Ed Sheeran";
	     musica.duracao = 4.7;
	     musica.tocar();
	     musica.pausar();
	     musica.mostrarDetalhes();
	     
	     musica.titulo = "Billie Jean";
	     musica.artista = "Michael Jackson";
	     musica.duracao = 5;
	     musica.tocar();
	     musica.pausar();
	     musica.mostrarDetalhes();

	}

}
