package lista22;
import java.util.Scanner;

public class VideoGameP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VideoGame videogame = new VideoGame();
		
		videogame.marca ="Polystation";
		videogame.modelo ="Paraguai";
		videogame.ligado = true;
		
		videogame.ligar();
		videogame.desligar();
		videogame.verificarStatus();

	}

}
