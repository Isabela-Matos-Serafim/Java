import java.util.Scanner;

public class Lista09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = 1;
		while(numero <= 10) {
			System.out.println(numero);
			numero ++;
		}

		
		int numero2 = 10;
		while(numero2 >= 1) {
			System.out.println(numero2);
			numero2 --;
		}
		
		
		
		int cincoemcinco = 0;
		while(cincoemcinco <=100) {
			System.out.println(cincoemcinco);
			cincoemcinco += 5;
		}
		
		
		int hospital = 1;
		while (hospital <= 5) {
			System.out.println("Eu (não) gosto de Java (socorro)");
			hospital ++;
		}
		
		
		int contagem2 = 1;
		int somativa;
		int somativa2 = 0;
		while (contagem2 <=5) {
			System.out.println("digite um numero: ");
		somativa = scanner.nextInt();
			somativa2 = somativa + somativa2;
			System.out.println(somativa2);
			contagem2 ++;
		}
		
		
		System.out.println("Me diga a senha");
		int senha = scanner.nextInt();
		while(senha != 1234) {
			System.out.println("Tente novamente");
			int senha = scanner.nextInt();
		}
		System.out.println("Senha correta");
		
		
		System.out.println("Diz um numero ai");
		int numeroai = scanner.nextInt();
		while(numeroai >= 1) {
			System.out.println(numeroai);
			numeroai --;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
