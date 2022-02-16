import java.util.Scanner;

public class SomaColecao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
//		int vetor[] = new int[100];
//		int i = 0;
		int soma = 0;
		
		while(num != -1) {
			soma += num;
//			vetor[i++] = num;
			num = input.nextInt();
		}
		
		System.out.printf("%d\n", soma);
		input.close();
	}
}