package Entidades;

public class Conta {
	private Integer Numero;
	private String Titular;
	private Double Saldo;
	
	
	
	
	public Conta(Integer numero, String titular, Double saldo) {
		super();
		Numero = numero;
		Titular = titular;
		Saldo = saldo;
	}
	//operacao de saque
	private void Saque(Double quantia) {
		this.Saldo -= quantia;
	}
	//operacao de deposito
	private void Deposito(Double quantia) {
		this.Saldo += quantia;
	}

	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		Numero = numero;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public Double getSaldo() {
		return Saldo;
	}

	
	
	
}
