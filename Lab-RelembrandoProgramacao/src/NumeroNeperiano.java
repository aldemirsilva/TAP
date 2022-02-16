import java.util.Scanner;

public class NumeroNeperiano {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fatorial = 1;
		int n = input.nextInt();
		double euler = 1.0;

		if(n == 0 || n == 1) {
			System.out.printf("%.6f", euler);
		}
		else {
			for(int i = 1; i < n; i++) {
				fatorial *= i;
				euler += 1.0/fatorial;
			}
			System.out.printf("%.6f", euler);
		}
		input.close();
	}
}