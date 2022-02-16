import java.util.Scanner;

public class OperacoesString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String linha = input.nextLine();
		input.close();
		int tamNome = linha.length();
		Character primeiro = linha.charAt(0);
		Character ultimo = linha.charAt(tamNome-1);
		int cont = 0;
		System.out.println(tamNome);
		System.out.println(primeiro);
		System.out.println(ultimo);
		System.out.println(linha.toUpperCase());
		System.out.println(linha.toLowerCase());
		System.out.println(linha.replace('a', 'e'));
		for(int i = 0; i < tamNome; i += 2) {
			System.out.print(linha.charAt(i));
		}
		System.out.println();
		for(int i = 0; i < tamNome; i++) {
			if(linha.charAt(i) == 'a' || linha.charAt(i) == 'e' || linha.charAt(i) == 'i' || linha.charAt(i) == 'o' || linha.charAt(i) == 'u' || linha.charAt(i) == 'A' || linha.charAt(i) == 'E' || linha.charAt(i) == 'I' || linha.charAt(i) == 'O' || linha.charAt(i) == 'U') {
				cont++;
			}
		}
		System.out.println(cont);
	}
}