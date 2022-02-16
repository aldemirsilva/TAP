import java.util.Scanner;

public class AproximacaoSeno {
	public static long fatorial(long n) {
		long fatorial = 1;

		if(n == 0 || n == 1) {
			return fatorial;
		}
		else {
			for(long i = 1; i <= n; i++) {
				fatorial *= i;
			}
			return fatorial;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double seno = 0.0;
		double angulo = Math.toRadians(input.nextDouble());
		long termos = input.nextLong();

		for(long n = 0; n < termos; n++) {
			seno += Math.pow(-1, n) * Math.pow(angulo, 2*n+1) / fatorial(2*n+1);
			System.out.printf("%.10f\n", seno);
		}
		input.close();
	}
}