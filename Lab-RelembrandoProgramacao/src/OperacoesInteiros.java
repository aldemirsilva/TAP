import java.util.Scanner;

public class OperacoesInteiros {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int soma = 0;
		int elementos = 0;
		int pares = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		while(num != -1) {
			elementos++;
			soma += num;
			if(num > maior) maior = num;
			if(num < menor) menor = num;

			if(num %2 == 0)
				pares++;

			num = input.nextInt();

			if(num == -1) {
				System.out.println(elementos);
				System.out.println(pares);
				System.out.println(elementos-pares);
				System.out.println(soma);
				System.out.printf("%.2f\n", (float) soma/elementos);
				System.out.println(maior);
				System.out.println(menor);
				elementos = 0;
				pares = 0;
				soma = 0;
				maior = Integer.MIN_VALUE;
				menor = Integer.MAX_VALUE;
				num = input.nextInt();
			}

		}
		input.close();
	}
}