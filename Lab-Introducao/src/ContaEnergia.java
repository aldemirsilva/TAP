import java.util.Scanner;

public class ContaEnergia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float valor = input.nextFloat();
		Character tipo = input.next().charAt(0);
		
		if(tipo.equals('R') && valor >= 0) {
			if(valor <= 500) {
				valor *= 0.4;
			}
			else {
				valor *= 0.65;
			}
			System.out.printf("%.2f", valor);
		}
		
		else if(tipo.equals('C') && valor >= 0) {
			if(valor <= 1000) {
				valor *= 0.55;
			}
			else {
				valor *= 0.6;
			}
			System.out.printf("%.2f", valor);
		}
		
		else if(tipo.equals('I') && valor >= 0) {
			if(valor <= 5000) {
				valor *= 0.55;
			}
			else {
				valor *= 0.6;
			}
			System.out.printf("%.2f", valor);
		}
		
		else {
			System.out.printf("%.2f", -1.00);
		}
		input.close();
	}
}
