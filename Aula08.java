import java.util.Scanner;

public class Aula08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Escolha a oparação matematica de dois numeros");
		String operacao = scanner.next();
		
		switch(operacao) {
		case "+":
			int adicao = 5+5;
			System.out.println(adicao);
			break;
		case "-":
			int subtracao = 5-5;
			System.out.println(subtracao);
		break;
		case "*":
			int mult = 5-5;
			System.out.println(mult);
		break;
		case "/":
			int div = 5-5;
			System.out.println(div);
		break;
		default:
		System.out.println("operação icorreta");
		break;
		}
		 
		System.out.println("Escolha um dia da semana e digite o número correspondente!");
		String numero = scanner.next();
		
		switch(numero) {
		case "2","3","4","5","6":
			System.out.println("Dia útil!");
		break;
		case"1","7":
			System.out.println("Final de semana");
		default:
			System.out.println("Dia invalido");
		}
		
		
		System.out.println("Diga o codigo da bebida desejada!");
		String bebida = scanner.next();
		
		switch (bebida) {
		case "1":
			System.out.println("O café custa R$5,00");
		case "2":
			System.out.println("O chá custa R$3,50");
		case "3":
			System.out.println("O suco custa R$4,00");
		case "4":
			System.out.println("O refrigerante custa R$4,50");
		default:
			System.out.println("Código invalido");
		}
			
		System.out.println("Qual é o véiculo?");
		String veiculo = scanner.next();
		
		switch(veiculo) {
		case "Carro":
			System.out.println("O veiculo é leve");
		case "Moto":
			System.out.println("O veiculo é uma motocicleta");
		case "Caminhão":
			System.out.println("O veiculo é pesado");
		default:
			System.out.println("Veiculo invalido");
		}
		
		
		System.out.println("Qual o codigo do seu plano?");
		String plano = scanner.next();
		
		switch (plano) {
		case "1":
			System.out.println("Acesso limitado");
		case "2":
			System.out.println("Acesso padrão + suporte");
		case "3":
			System.out.println("Acesso total + suporte prioritário");
		default:
			System.out.println("Plano invalido");
		}
			
			
		System.out.println("Digite um número que represente um mes!");
		String ooutonoesempreigualasflhascaemnoquintalsonaocaiomeuamorpoisnaotemjeitoeimortal= scanner.next();
		
		switch (ooutonoesempreigualasflhascaemnoquintalsonaocaiomeuamorpoisnaotemjeitoeimortal) {
		case "12","1","2":
			System.out.println("Verão");
		case "3","4","5":
			System.out.println("Outono");
		case "6","7","8":
			System.out.println("Inverno");
		case "9","10","11":
			System.out.println("Primavera");
		default:
			System.out.println("Mes invalido");
		
		}
		
		
		System.out.println("Qual o codigo do seu ingresso?");
		String ingresso = scanner.next();
		
		switch (ingresso) {
		case "1":
			System.out.println("O preço do ingresso inteiro é R$50,00");
		case "2":
			System.out.println("O preço do ingresso meia entrada é R$25,00");
		case "3":
			System.out.println("O preço do ingresso VIP é R$100,00");
		default:
			System.out.println("Ingresso invalido");
		}
	
		
		System.out.println("Qual o codigo do seu idioma?");
		String idioma = scanner.next();
		
		switch (idioma) {
		case "1":
			System.out.println("Olá");
		case "2":
			System.out.println("Hello");
		case "3":
			System.out.println("Hola");
		default:
			System.out.println("Idioma invalido");
		}
		
		

	}

}
