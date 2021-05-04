package Entidades;
//especificarr somente o que tem à mais em relação à conta Pai
public class contaEmpresa extends Conta {
	private Double Limite;
	
	//construtor passando atributos da Conta(pai) e o atributo Limite da contaEmpresa(filho)
	public contaEmpresa(Integer numero, String titular, Double saldo, Double limite) {
		super(numero, titular, saldo);
		Limite = limite;
	}
	
	private void Emprestimo(Double quantidade) {
		
	}

	

	
	
	
	
}
