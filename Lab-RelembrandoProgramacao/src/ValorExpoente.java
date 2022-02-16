import java.util.Scanner;

public class ValorExpoente {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long num = input.nextLong();
		long k = 1;
		long soma = 2;
		
		while(soma <= num) {
			k++;
			soma += Math.pow(2, k);
		}
		System.out.printf("%d\n", k);
		input.close();
	}
}