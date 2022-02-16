import java.util.Scanner;

public class AproximacaoPi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 2, b = 3, c = 4, n = input.nextInt();
		double pi = 3.0;
		if(n > 1) {
			System.out.printf("%.6f\n", pi);
			for(int i = 2; i <= n; i++) {
				pi += 4.0/(a*b*c)*Math.pow(-1, i);
				a += 2; b += 2; c += 2;
				System.out.printf("%.6f\n", pi);
			}
		}
		else
			System.out.printf("%.6f\n", pi);
		input.close();
	}
}