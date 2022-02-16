import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num, soma = 0;
		
		for(int i = 0; i < 3; i++) {
			num = input.nextDouble();
			soma += num;
		}
		double media = soma/3;
		System.out.printf("%.2f\n", media);
		input.close();
	}
}