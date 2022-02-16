import java.util.Scanner;

public class RaizDois {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int iteracoes = input.nextInt();
		double acumulador = 1.0;
		input.close();

		for(int i = 0; i < iteracoes; i++) {
			acumulador = 2.0 + 1.0/acumulador;
			System.out.printf("%.14f\n", 1.0 + 1.0 / acumulador);
		}
	}
}