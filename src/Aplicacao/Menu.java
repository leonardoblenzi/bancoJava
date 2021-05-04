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
		System.out.println("----------CONTA PESSOA FÍSICA--------");
		System.out.println("----------Digite seus dados de cadastro--------");
		System.out.print("\nNUMERO DA CONTA: ");
		Integer numero = sc.nextInt();
		System.out.print("\nNOME TITULAR: ");
		String nome = sc.nextLine();
		sc.nextLine();//limpar buffer de entrada
		System.out.print("\nSALDO: ");
		Double saldo = sc.nextDouble();
		
		Conta conta = new Conta(numero, nome, saldo);
		
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
			if(conta.getSaldo() >= valor) {
				conta.Saque(valor);
				//volta para menu de conta fisica
				contaFisica();
			}
			else {
				System.out.print("*********SALDO INDÍSPONIVEL*******");
				contaFisica();
			}
			
		}
		//deposito
		else if(n==2) {
			System.out.print("Informe um valor para deposito: ");
			Double valor = sc.nextDouble();
			conta.Deposito(valor);
			contaFisica();
		}
		//voltar
		else if(n == 0) {
			menuStart();
		}
	}
	
	public void contaEmpresa() {
		
	}
	
}
