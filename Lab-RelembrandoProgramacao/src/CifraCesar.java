import java.util.Scanner;

public class CifraCesar {
	public static void main(String[] args) {
		char cOriginal;
		char cCifrado;
		char vetor[] = new char[100];
		Scanner input = new Scanner(System.in);
		int desloc = input.nextInt();
		String frase = input.nextLine().trim();

		input.close();

		for(int i = 0; i < frase.length(); i++) {
			cOriginal = frase.charAt(i);
			if( (cOriginal >= 65 && cOriginal <= 90) || (cOriginal >= 97 && cOriginal <= 122) ) {
				cCifrado = (char) (cOriginal - 'a');
				cCifrado = (char) ((cCifrado + desloc) % 26);
				cCifrado += 'A';
				vetor[i] = cCifrado;
			}
			else
				vetor[i] = cOriginal;
		}

		for(int i = 0; i < frase.length(); i++) {
			System.out.print(vetor[i]);
		}

	}
}