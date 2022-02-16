import java.util.Scanner;

public class TimeFutebol {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int vetor[][] = new int[2][100];
		int i = 0, j = 0;
		int elementos = 0;

		while(num != -1) {
			vetor[i][j++] = num;
			elementos++;
			num = input.nextInt();
			
			if(num == -1) {
				i++;
				if(i == 2)
					break;
				else {
					num = input.nextInt();
					j = 0;
					}
			}
		}
		
		if(num == -1) {
			int vitorias  = 0;
			int empates = 0;
			int derrotas = 0;
			for(j = 0; j < elementos/2; j++) {
				if(vetor[0][j] > vetor[1][j])
					vitorias++;
				else if(vetor[0][j] == vetor[1][j])
					empates++;
				else // if(vetor[0][j] < vetor[1][j])
					derrotas++;
			}
			System.out.print(vitorias + " ");
			System.out.print(empates + " ");
			System.out.println(derrotas);
		}
		input.close();
	}
}