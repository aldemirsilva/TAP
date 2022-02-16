import java.util.Scanner;

public class Xadrez {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num=input.nextInt();
		int linha=0, coluna=0;
		while(linha<num) {
			if(linha % 2 == 0) {
				while (coluna<num-1) {
					System.out.print("* ");
					coluna++;
					if(coluna == num-1) {
						System.out.println('*');
					}
				}
				coluna=0;
			}
			else {
				while (coluna<num) {
					System.out.print(" *");
					coluna++;
				}
				System.out.println();
				coluna=0;
			}
			linha++;
		}
		input.close();
	}
}