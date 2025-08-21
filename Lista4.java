import java.util.Scanner;

public class Lista4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		//Exericio 1
		double idade;
		System.out.println("Qual a sua idade?");
		idade = scanner.nextDouble();
		if(idade >= 18) {
			System.out.println("Você tem " + idade + " anos e é maior de idade");
		}else {
			System.out.println("Você tem " + idade +" anos e é menor de idade");
		}
		
		//Exercicio 2
		double numero1;
		double numero2;
		System.out.println("Diga um número!");
		numero1 = scanner.nextDouble();
		System.out.println("Diga outro numero!");
		numero2 = scanner.nextDouble();
		if(numero1 > numero2) {
			System.out.println("O primeiro número é maior");
		}else {
			System.out.println("O segundo número é maior ou eles são iguais");
		}
		
		//Exercicio 3
		double nota;
		System.out.println("Qual sua nota?");
		nota = scanner.nextDouble();
		if(nota > 7) {
			System.out.print("Aprovado: sua nota foi " + nota);
		}else {
			System.out.println("Reprovado: sua nota foi " + nota);
		}
		
		//Exercicio 4
		double numerodahora;
		System.out.println("Diga um numer bem legal ai");
		numerodahora = scanner.nextDouble();
		if(numerodahora > 0) {
			System.out.println("É um número possitivo");
		}else {
			System.out.println("O númeo é negativo ou zero");
		}
		
		//Exercicio 5
		double socorro;
		System.out.println("Qual a distancia da entrega");
		socorro = scanner.nextDouble();
		if(socorro <= 50) {
			System.out.println("O preço do frete vai ser 10 conto");
		}else {
			double fretao = socorro * 0.5;
			System.out.println("O preço do frete vai ser " + fretao);
		}
		
		//Exercicio 6
		double possiveldez;
		System.out.println("Diga qualquer número");
		possiveldez = scanner.nextDouble();
		if(possiveldez == 10) {
			System.out.println("É 10");
		}else {
			System.out.println("Não é 10");
		}
		
		//Exercicio 7 
		String ehounaoeh;
		System.out.println("Você é assosiado?");
		ehounaoeh = scanner.next();
		if (ehounaoeh != "Não") {
			System.out.println("Você tem direito ao desconto");
		}else {
			System.out.println("Você não tem direiro ao desconto");
		}
		
		//Exercicio 8
		double horas;
		System.out.println("Quantas horas extras você trabalhou?");
		horas = scanner.nextDouble();
		if(horas <= 10){
			double chicobuarque = horas*20;
			System.out.println("Bonûs por hora extra R$" + chicobuarque);
		}else {
			double horse = horas*15;
			System.out.println("Bonûs por hora extra R$" + horse);
		}
		}
		
	}


