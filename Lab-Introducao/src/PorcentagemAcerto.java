import java.util.Scanner;

public class PorcentagemAcerto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int respostas[] = new int[100];
		int gabarito[] = new int[100];
		int i = 0;
		int num = input.nextInt();
		int total = 0, acertos = 0;
		
		while(num != -1) {
			respostas[i++] = num;
			total++;
			num = input.nextInt();
		}
		
		i = 0;
		num = input.nextInt();
		
		while(num != -1) {
			gabarito[i++] = num;
			num = input.nextInt();
		}
		input.close();
		for(i = 0; i < total; i++) {
			if(respostas[i] == gabarito[i]) {
				acertos++;
			}
		}
		System.out.printf("%.2f", (float) acertos/total * 100);
	}
}