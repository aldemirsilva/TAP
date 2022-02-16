import java.util.Scanner;

public class SomaDigitos {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int num = input.nextInt();
 		int soma = 0;
 
 		while (num > 0) {
        	soma += num % 10;
            num /= 10;
        }
        System.out.printf("%d", soma);
        input.close();
	}
}