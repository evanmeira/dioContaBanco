package conta;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agência");
		int agencia = scanner.nextInt();
		
		System.out.println("Por favor, digite o número da conta");
		int numero = scanner.nextInt();
		
		System.out.println("Por favor, digite o nome do titular");
		String nome = scanner.next();
		
		System.out.println("Por favor, digite o saldo inicial");
		Double saldo = scanner.nextDouble();
		
		Conta conta = new Conta(numero, agencia, nome, saldo);
		
		System.out.println(String.format(
			"Olá %s, obrigado por criar uma conta em nosso banco, "
			+ "sua agência é %d, conta %d "
			+ "e seu saldo R$%.2f já está disponível para saque",
			conta.getNome(), conta.getAgencia(), conta.getNumero(), conta.getSaldo()
		));
		
	}

}
