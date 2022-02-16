import java.util.Scanner;

public class Mediana {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vetor[] = new int[100];
		int num = input.nextInt();
		int i = 0;
		double mediana = 0.0;
		
		while(num!=-1) {
			vetor[i++] = num;
			num = input.nextInt();
		}
		
		if(num == -1 && i % 2 != 0)
			mediana = vetor[i/2];
		else if(num == -1 && i % 2 == 0)
			mediana = (vetor[i/2-1] + vetor[i/2])/2.0;
		
		System.out.printf("%.1f", mediana);
		System.out.println();
		input.close();
	}
}