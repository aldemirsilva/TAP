import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double temperatura = input.nextDouble();
		temperatura = 9 * temperatura / 5 + 32;
		
		System.out.printf("%.1f", temperatura);
		input.close();
	}

}
