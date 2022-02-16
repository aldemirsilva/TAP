import java.util.Scanner;

public class Desconto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float valor = input.nextFloat();
		
		if(valor >= 200.00) {
			valor *= 0.95;
			System.out.printf("%.2f",valor);
		}
		else {
			System.out.printf("%.2f",valor);
		}
		input.close();
	}

}