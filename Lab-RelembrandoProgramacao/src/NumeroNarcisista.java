import java.util.Scanner;

public class NumeroNarcisista {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		int a = num;
		int digitos = 0;
		int i = 0;
		int vetor[] = new int[100];

		while(num > 0) {
			vetor[i++] = num % 10;
			num /= 10;
			digitos++;
		}

		for(i = 0; i < digitos; i++) {
			num += Math.pow(vetor[i],digitos);
		}

		if(num == a)
			System.out.println("SIM");
		else
			System.out.println("NAO");
	}
}