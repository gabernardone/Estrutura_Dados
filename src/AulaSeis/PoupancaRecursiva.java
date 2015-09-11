package AulaSeis;

import java.util.Scanner;

public class PoupancaRecursiva {

	private Double TxJurosMensal = 0.3;
	private Double Saldo = 0.0;

	public void run() {
		Scanner readLine = new Scanner(System.in);

		System.out.println("Qual a taxa de juros mensal?");
		this.TxJurosMensal = Double.parseDouble(readLine.nextLine());

		System.out.println("Qual o saldo inicial?");
		this.Saldo = Double.parseDouble(readLine.nextLine());
		
		this.Depositar();
	}

	private void Depositar() {
		Scanner readLine = new Scanner(System.in);
		
		System.out.println("Qual o valor a ser depositado?");
		Double Valor = Double.parseDouble(readLine.nextLine());
		
		if (Valor != 0) {
			Double Juros = ((Valor * this.TxJurosMensal) / 100);
			this.Saldo += Valor + Juros;
			this.Depositar();
		} else {
			System.out.println("============= Fim da Transação =============");
			System.out.println("Saldo atual: " + this.Saldo);
		}
		
	}

}
