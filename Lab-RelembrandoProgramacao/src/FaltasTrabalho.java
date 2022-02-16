import java.util.Scanner;

public class FaltasTrabalho {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		double soma[] = new double[8];
		int total = 0;
		
		while(num != -1) {
			total++;
			soma[num]++;
			num = input.nextInt();
		}
		input.close();
		for(num = 2; num <= 7; num++) {
			System.out.printf("%.1f ", (double) soma[num]/total*100);
		}
	}
}