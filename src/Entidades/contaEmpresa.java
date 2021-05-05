package Entidades;
//especificarr somente o que tem à mais em relação à conta Pai
public class contaEmpresa extends Conta {
	private Double Limite;
	
	public contaEmpresa() {
		
	}
	
	//construtor passando atributos da Conta(pai) e o atributo Limite da contaEmpresa(filho)
	public contaEmpresa(Integer numero, String titular, Double saldo, Double limite) {
		super(numero, titular, saldo);
		Limite = limite;
	}
	/*se o limite do cliente for maior ou igual a quantidade que ele quer emprestar
	 vai chamar o metodo de deposito para receber o valor na conta*/
	public void Emprestimo(Double quantidade) {
		if(Limite >= quantidade) {
			Deposito(quantidade);
			System.out.println("EMPRESTIMO EFETUADO");
		}
		else {
			System.out.println("LIMITE INSUFICIENTE");
		}
	}

	public Double getLimite() {
		return Limite;
	}

	public void setLimite(Double limiteEmprestimo) {
		Limite = limiteEmprestimo;
	}
	
	

	
	

	
	
	
	
}
