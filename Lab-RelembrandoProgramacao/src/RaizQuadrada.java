import java.util.Scanner;

public class RaizQuadrada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		double raiz = Math.sqrt(num);
		System.out.printf("%.4f", raiz);
		input.close();
	}

}
