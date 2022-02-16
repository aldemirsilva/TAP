import java.util.Scanner;

public class HorasTrabalho {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int j;
		int soma = 0;
		
		while(num != -1) {
			for(j = 0; j < 7; j++) {
				soma += num;
				num = input.nextInt();
			}
			System.out.println(soma);
			soma = 0;
		}
		input.close();
	}
}