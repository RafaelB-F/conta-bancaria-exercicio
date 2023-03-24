package exercicio;

public class ContaBancaria {
	
	private int numConta;
	private String titular;
	private double saldo;

	
	public ContaBancaria(int numConta, String titular, double depositoInicial) {
		this.numConta = numConta;
		this.titular = titular;
		depositar(depositoInicial);
	}

	public ContaBancaria(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}

	public int getNumConta() {
		return numConta;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor + 5;
	}
	
	
	public String toString() {
		return "Conta: " + numConta + ", Titular: " + titular + ", Saldo: R$" + String.format("%.2f", saldo);
	}
	
}
