package lista22;
import java.util.Scanner;

public class GatoP {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Gato gato = new Gato();
	
	gato.nome = "Sr. Meia noite";
	gato.raca = "Bombaim";
	gato.idade = 13;
	gato.miar();
	gato.comer();
	gato.mostrarInformacoes();
	
	gato.nome = "Gizmo";
	gato.raca = "Só Deus sabe";
	gato.idade = 10;
	
	gato.miar();
	gato.comer();
	gato.mostrarInformacoes();

	}

}
