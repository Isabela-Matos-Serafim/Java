import java.util.Scanner;

public class IsComplicaded {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	double idade;
	System.out.println("Quantos anos você tem?");
	idade = scanner.nextDouble();
	if(idade <= 12) {
		System.out.println("Você é uma criança");
	}else if(idade <= 17){
		System.out.println("Você é um adolecente");
	}else if(idade <= 59) {
		System.out.println("Você é um adulto");
	}else if(idade >= 60){
		System.out.println("Você é um idoso");
	}
	
	double temperatura;
	System.out.println("Quantos graus está fazendo?");
	temperatura = scanner.nextDouble();
	if(temperatura <= 10) {
			System.out.println("Tá na era gracial é?");
	}else if(temperatura <= 20) {
		System.out.println("Tá mó frio");
	}else if(temperatura <= 30){
		System.out.println("Tá de boa");
	}else if(temperatura >= 31){
		System.out.println("MUITO QUENTE AHHHHHHHHH");
	}
	
	double nota;
	System.out.println("Quanto tu tirou?");
	nota = scanner.nextDouble();
	if(nota <= 60) {
		System.out.println("F");
	}else if(nota <= 70) {
	System.out.println("D");	
	}else if(nota <= 80) {
		System.out.println("C");
	}else if(nota <= 90) {
		System.out.println("B");
	}else if(nota <= 100) {
		System.out.println("A");
	}
	
	System.out.println("Digite uma senha: ");
	String senha = scanner.next();
	if(senha.equals("admin")) {
		System.out.println("Acesso permitido");
	}else {
		System.out.println("Acesso negado");
	}
	
	System.out.println("Qual o primeiro nome?");
	String nome1 = scanner.next();
	System.out.println("Qual o segundo nome?");
	String nome2 = scanner.next();
	if(nome1 != nome2) {
		System.out.println("São diferentes!");
	}else {
		System.out.println("São iguais");
	}
	
	System.out.println("Qual sua cor favorita?");
	String cor = scanner.next();
	if(cor.equals("azul")) {
		System.out.println("Boa escolha!");
	}else if(cor.equals("vermelho")) {
		System.out.println("Cor vibrante!");
	}else if(cor.equals("verde")) {
		System.out.println("Cor da natureza");
	}else {
		System.out.println("Cor não cadrastada");
	}
	
	System.out.println("Escolha uma letra");
	String letra = scanner.next();
	if(letra == ("a"+"e"+"i"+"o"+"u")){
		System.out.println("Não é vogal");
	}else {
		System.out.println("É uma vogal");
	}
	}
}
