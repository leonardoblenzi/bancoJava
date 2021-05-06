package Entidades;

public class Conta {
	private Integer Numero;
	private String Titular;
	protected Double Saldo;
	
	public Conta() {
		
	}
	
	
	public Conta(Integer numero, String titular, Double saldo) {
		super();
		Numero = numero;
		Titular = titular;
		Saldo = saldo;
	}
	//operacao de saque
	public void Saque(Double quantia) {
		if(Saldo >= quantia) {
			this.Saldo -= quantia;
			System.out.println("*********SAQUE EFETUADO***********");
		}
		else {
			System.out.println("*********SALDO INDÍSPONIVEL*******");
			
		}
		
	}
	//operacao de deposito
	public void Deposito(Double quantia) {
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
