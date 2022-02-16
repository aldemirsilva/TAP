import java.util.Scanner;

public class SomaColecoes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int soma = 0;

		while(num != -1) {
			soma += num;
			num = input.nextInt();
			if(num == -1) {
				System.out.printf("%d\n", soma);
				soma = 0;
				num = input.nextInt();
			}
		}
		input.close();
	}
}