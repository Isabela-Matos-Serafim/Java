import java.util.Scanner;

public class lista_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
		int numero = 10;
		while(numero == 30) {
			System.out.println(numero);
			numero ++;	
		}
		
		int vez = 3;
		int total = 0;
		while (vez > 0) {
			System.out.println("Digite um numero");
			int numerodito = scanner.nextInt();
			total = numerodito + total;
			vez --;
		}
		System.out.println("O total é " + total);
		
		int vezes = 5;
		int totaltotal = 0;
		while (vezes > 0) {
			System.out.println("Digite um numero");
			int numerofalado = scanner.nextInt();
			totaltotal = numerofalado + totaltotal;
			vezes --;
		}
		System.out.println("O total é " + totaltotal);
		
		System.out.println("Diga um numero supimpa!");
		int numerosupimpa = scanner.nextInt();
		int numerolegal = 1;
		while (numerosupimpa >= numerolegal) {
			System.out.println(numerolegal);
			numerolegal ++;
		}
		
		int conta2 = 1;
		int soma =1;
		int soma2 = 0;
		while (conta2 <=5) {
			soma2 = soma + soma2;
			System.out.println(soma2);
			conta2 ++;
			soma ++;
		}
	
		
		
		System.out.println("Manda um numero ae");
		int numeroae = scanner.nextInt();
		int dez = 0;
		while (dez <= 10) {
			int multiplicacao = numeroae * dez;
			System.out.println(multiplicacao);
			dez ++;
		}


	}

}
