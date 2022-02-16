import java.util.Scanner;

public class DiaSemana {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int dias[] = new int[8];
		int i = 0;
		int maior = Integer.MIN_VALUE;
		
		while(num != -1) {
			for(i = 1; i < 8; i++) {
				dias[i] += num;
				if(dias[i] > maior)
					maior = dias[i];
				num = input.nextInt();
			}
		}
		for(i = 1; i < 8; i++) {
			if(dias[i] == maior)
				System.out.println(i);
		}
		input.close();
	}
}