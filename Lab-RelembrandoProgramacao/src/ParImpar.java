import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vetor[] = new int[100];
		int i = 0;
		int num = input.nextInt();
		int total = 0;

		while(num != -1) {
			vetor[i++] = num;
			total++;
			num = input.nextInt();
		}
		input.close();

		for(i = 0; i < total; i++) {
			if(vetor[i]%2 == 0) System.out.println("PAR");
			else System.out.println("IMPAR");
		}
	}
}