package Aplicacao;
import java.util.Scanner;
import Entidades.*;
public class Menu {
	public static Scanner sc = new Scanner(System.in);
	
	public void menuStart() {
		
		
		System.out.println("---------BEM-VINDO AO BANCO NEXT-----------");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("---------Selecione seu tipo de conta-------");
		System.out.println("Conta pessoa física: 1");
		System.out.println("Conta empresarial: 2");
		
		System.out.print("Insira uma das opções: ");
		int n = sc.nextInt();
		
		//se for 1 vai chamar metodo normal
		if(n == 1) {
			contaFisica();
		}
		//se for 2 vai chamar metodo para empresas
		else if(n == 2) {
			contaEmpresa();
		}
		//se for valor inválido vai voltar para o menu
		else {
			System.out.println("OPÇÃO INVÁLIDA!");
			menuStart();
		}
	}//fim metodo menu
	
	//opcao conta normal
	public void contaFisica() {
		System.out.println("----------CONTA PESSOA FÍSICA------------------");
		System.out.println("----------Digite seus dados de cadastro--------");
		System.out.print("\nNUMERO DA CONTA: ");
		Integer numero = sc.nextInt();
		System.out.print("\nNOME TITULAR: ");
		String nome = sc.nextLine();
		sc.nextLine();//limpar buffer de entrada
		System.out.print("\nSALDO: ");
		Double saldo = sc.nextDouble();
		
		Conta conta = new Conta(numero, nome, saldo);
		//chama as operacoes e passa a conta como parametro
		operacoesFisica(conta);
		
	}//fim metodo contaFisica();
	
	//metodo conta empresa
	public void contaEmpresa() {
		System.out.println("----------CONTA EMPRESARIAL--------------------");
		System.out.println("----------Digite seus dados de cadastro--------");
		System.out.print("\nNUMERO DA CONTA: ");
		Integer numero = sc.nextInt();
		System.out.print("\nNOME TITULAR: ");
		String nome = sc.nextLine();
		sc.nextLine();//limpar buffer de entrada
		System.out.print("\nSALDO: ");
		Double saldo = sc.nextDouble();
		System.out.print("\nLIMITE: ");
		Double limite= sc.nextDouble();
		
		contaEmpresa contaEmp = new contaEmpresa(numero, nome, saldo, limite);
		
		operacoesEmp(contaEmp);
	
	}
	//recebe o objeto conta
	//operacoes para conta de pessoas fisicas
	public void operacoesFisica(Conta conta) {
		System.out.println("**************OPERAÇÕES************");
		System.out.println("SAQUE: 1");
		System.out.println("DEPOSITO: 2");
		System.out.println("VOLTAR: 0");
		System.out.print("Informe a operação desejada: ");
		int n = sc.nextInt();
		//saque
		if(n== 1) {
			System.out.print("Informe um valor para saque: ");
			Double valor = sc.nextDouble();
			conta.Saque(valor);
			verificaFisica(conta);
			
		}
		//deposito
		else if(n==2) {
			System.out.print("Informe um valor para deposito: ");
			Double valor = sc.nextDouble();
			conta.Deposito(valor);
			verificaFisica(conta);
		}
		//voltar
		else if(n == 0) {
			menuStart();
		}
	}
	
	//operacoes para conta empresarial
	public void operacoesEmp(contaEmpresa contaEmp) {
		System.out.println("**************OPERAÇÕES************");
		System.out.println("SAQUE: 1");
		System.out.println("DEPOSITO: 2");
		System.out.println("EMPRESTIMO: 3");
		System.out.println("VOLTAR: 0");
		System.out.print("Informe a operação desejada: ");
		int n = sc.nextInt();
		//saque
		if(n== 1) {
			System.out.print("Informe um valor para saque: ");
			Double valor = sc.nextDouble();
			contaEmp.Saque(valor);
			verificaEmp(contaEmp);
		}
		//deposito
		else if(n==2) {
			System.out.print("Informe um valor para deposito: ");
			Double valor = sc.nextDouble();
			contaEmp.Deposito(valor);
			verificaEmp(contaEmp);
		}
		else if(n==3) {
			System.out.print("Informe um valor para emprestimo: ");
			Double valor = sc.nextDouble();
			contaEmp.Emprestimo(valor);
			verificaEmp(contaEmp);
		}
		//voltar
		else if(n == 0) {
			menuStart();
	}
		
	}
	//verifica se o usuario quer fazer nova op ou voltar ao menu inicial
	public void verificaFisica(Conta conta) {
		System.out.println("Deseja fazer uma nova operacão?\n SIM:1 \n NÃO:0");
		int op = sc.nextInt();
		if(op == 1) {
			operacoesFisica(conta);
		}
		else if(op ==0) {
			menuStart();
		}
		else {
			System.out.println("OPÇÃO INVALIDA");
			verificaFisica(conta);
		}
	}
	
	public void verificaEmp(contaEmpresa contaEmp) {
		System.out.println("Deseja fazer uma nova operacão?\n SIM:1 \n NÃO:0");
		int op = sc.nextInt();
		if(op == 1) {
			operacoesEmp(contaEmp);
		}
		else if(op ==0) {
			menuStart();
		}
		else {
			System.out.println("OPÇÃO INVALIDA");
			verificaEmp(contaEmp);
		}
	}
	
	
}
