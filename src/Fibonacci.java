import java.util.Scanner;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int n;
		System.out.println("Digite um número: ");
		
		@SuppressWarnings("resource")
		Scanner f = new Scanner(System.in);
		n = f.nextInt();
		
		for (int i = 0; i < n ; i++) {
				
			System.out.println("Termo: " +Fibo(i));
		}	
		
	}
	
	public static int Fibo(int n){
		if(n < 2){
			return n;
		}
		else{
			return Fibo(n - 1) + Fibo(n - 2);
		}		
	}	
	
}
