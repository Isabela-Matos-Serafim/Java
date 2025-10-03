import java.util.Scanner;

public class Lista19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Manda um numero");
		int numero = scanner.nextInt();
		du(numero);
	}
	public static void du (int numero) {
		if(numero > 0) {
			System.out.println("Positivo");
		}
		if(numero < 0) {
			System.out.println("Negativo");
		}
		if(numero == 0) {
			System.out.println("Zero");
		}
	}

}
