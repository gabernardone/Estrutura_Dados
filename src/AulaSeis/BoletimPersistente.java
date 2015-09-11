package AulaSeis;

import java.util.Scanner;

public class BoletimPersistente {

	private Double MediaAprovacao;
	private int NumeroFaltas;
	
	public void run() {
		Scanner readLine = new Scanner(System.in);

		System.out.println("Qual a média de aprovação?");
		this.MediaAprovacao = Double.parseDouble(readLine.nextLine());

		System.out.println("Qual o máximo de faltas?");
		this.NumeroFaltas = Integer.parseInt(readLine.nextLine());

		this.cadastrarNotasFrequencia(0);
	}

	private void cadastrarNotasFrequencia( int n ) {
		Scanner readLine = new Scanner(System.in);

		System.out.println("Qual a nota um?");
		Double NotaUm = Double.parseDouble(readLine.nextLine());
		
		System.out.println("Qual a nota dois?");
		Double NotaDois = Double.parseDouble(readLine.nextLine());
		
		System.out.println("Qual a quantidade de falas?");
		int Faltas = Integer.parseInt(readLine.nextLine());
		
		Double media = ((NotaUm+NotaDois)/2);
		
		if( media > this.MediaAprovacao &&  Faltas < this.NumeroFaltas)
		{
			System.out.println("Parabéns pela persistência, você tentou "+n+" vezes até passar em estrutura de dados!");
		} else {
			System.out.println("Tente novamentes");
			this.cadastrarNotasFrequencia(n++);
		}
	}

}
