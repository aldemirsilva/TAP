import java.util.Scanner;

public class DistanciaAviao {
	public static void main(String[] args) {
		int i, j, distancia = 0;
		int[][] matriz = {
				{  0,  2, 11,  6, 15, 11,  1 },
				{  2,  0,  7, 12,  4,  2, 15 },
				{ 11,  7,  0, 11,  8,  3, 13 },
				{  6, 12, 11,  0, 10,  2,  1 },
				{ 15,  4,  8, 10,  0,  5, 13 },
				{ 11,  2,  3,  2,  5,  0, 14 },
				{  1, 15, 13,  1, 13, 14,  0 }
		};
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		j = input.nextInt();
		
		while(i != -1 && j != -1) {
			distancia += matriz[i/111-1][j/111-1];
			i = j;
			j = input.nextInt();
		}
		input.close();
		System.out.println(distancia);
	}
}