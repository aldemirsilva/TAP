import java.util.Scanner;

public class MediaColecoes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int soma = 0;
		int elementos = 0;

		while(num != -1) {
			soma += num;
			elementos++;
			num = input.nextInt();
			if(num == -1) {
				System.out.printf("%.2f\n", (double) soma/elementos);
				soma = 0;
				elementos = 0;
				num = input.nextInt();
			}
		}
		input.close();
	}
}