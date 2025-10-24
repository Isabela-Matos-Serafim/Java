package lista22;
import java.util.Scanner;

public class PizzaP {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Pizza pizza = new Pizza();
	
	pizza.sabor ="a moda de Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch";
	pizza.tamanho ="COLOSSAL";
	pizza.bordaRecheada = true;
	
	pizza.preparar();
	pizza.assando();
	pizza.mostrarInformacoes();
	
	pizza.sabor = "margareth";
	pizza.tamanho = "minuscula";
	pizza.bordaRecheada = false;
		
	pizza.preparar();
	pizza.assando();
	pizza.mostrarInformacoes();

	}

}
