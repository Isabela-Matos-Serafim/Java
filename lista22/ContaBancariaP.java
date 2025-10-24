package lista22;

public class ContaBancariaP {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		conta.titular = "Isabela";
		conta.saldo = 500;
		conta.depositar(200);
		conta.sacar(150);
		conta.sacar(700);
		conta.mostrarSaldo();








	}

}
