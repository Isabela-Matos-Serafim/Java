import java.util.Scanner;

public class Lista14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		for(int numero = 1; numero <=10; numero++) {
			System.out.println(numero);
		}
		
		
		int numerobacaudo = 0;
		for (int eseenedasilva = 0; eseenedasilva <= 100; eseenedasilva++) {
			numerobacaudo += eseenedasilva;
		}
		
		System.out.println(numerobacaudo);
		
		
		for (int cabeca =0; cabeca <=20; cabeca++) {
			if(cabeca%2==0) {
				System.out.println(cabeca);
			}
		}
		
		System.out.println("Passa um numero ai");
		int numeroai = scanner.nextInt();
		for (int jota =0; jota <=10; jota++) {
			int numeralpeganomeu = jota * numeroai;
			System.out.println(numeralpeganomeu);
		}
		
		
		int trump = 0;
		for(int yacut = 1; yacut <= 50; yacut ++) {
			if(yacut%2 != 0) {
				System.out.println(yacut);
			}
		}
		
		System.out.println("Manda um numero ae se possivel");
		int numeroae = scanner.nextInt();
		for(int uzi = 1; uzi <= numeroae; uzi++) {
			if(uzi % 2 == 1) {
				System.out.println(uzi);
			}
		}
		
		int h = 1;
		for(int y = 0; y < 5; y++) {
			int u;
			System.out.println("Digite um numero");
			u = scanner.nextInt();
			h = h * u;
		}
		System.out.println(h);
		
		
		for(int e=0;e<=10;e++) {
			System.out.println("Voce tem quantos anos de impresa: ");
			int idade = scanner.nextInt();
			if(idade >10) {
				System.out.println("Parabéns! Você irá receber um prêmio");
			}else {
				System.out.println("Quase lá");
			}
		
	}

}
