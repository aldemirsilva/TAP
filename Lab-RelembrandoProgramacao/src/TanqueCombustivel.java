import java.util.Scanner;

public class TanqueCombustivel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		double x = input.nextDouble();
		int opcao = input.nextInt();
		
//		double vesfera = 4.0/3.0 * Math.PI * Math.pow(r, 3);
//		double vcalota = Math.PI / 3.0 * Math.pow(x, 2) * (3 * r - x);
		
		if(opcao == 1)
			System.out.printf("%.4f", Math.PI / 3.0 * Math.pow(x, 2) * (3 * r - x));
		else if(opcao == 2)
			System.out.printf("%.4f", (4.0/3.0 * Math.PI * Math.pow(r, 3))-(Math.PI / 3.0 * Math.pow(x, 2) * (3 * r - x)));
		
		input.close();
	}
}