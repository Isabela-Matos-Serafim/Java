
public class MyClass {
  public static void main(String args[]) {
   System.out.print("Olá Mundo");
   //Variaveis 
   int idade = 24; //numeros inteiros
   double salario = 1.75; //Numeros quebrados
   boolean estudante = true; // verdadeiro ou falso
   String nome = "Juliana"; //texto
   
   System.out.println(idade);
   System.out.println("Minha idade é " + idade);
   System.out.println("O sálario é " + salario);
   System.out.println("A letra é " + letra);
   System.out.println("Estuda? " + estudante);
   System.out.println("Meu nome é " + nome);
   
   //Matematica 
   int num1 = 5;
   int num2 = 3;
   int soma = num1 + num2;
   int sub = num1 - num2;
   int mult = num1 * num2;
   double div = num1 / num2;
   System.out.println("Soma" + soma);
   System.out.println("Subtração" + sub);
   System.out.println("Multiplicação" + mult)
   System.out.println("Divisão" + div)
   
   /*Calculo de area de um retangulo*/
   /*largura * comprimento*/
   double largura = 7.5;
   double comprimento = 3.0;
   double area = largura * comprimento;
   System.out.println("Área: " + area);
   
   //calculo do desconto 
   double valor = 100;
   double desconto = 15; //15%
   double valorDesc = valor * (desconto / 100)
   double valorFinal = valor - valorDesc;
   System.out.println("A pagar " + valorFinal)
  }
}