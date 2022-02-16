import java.util.Scanner;

public class TipoTriangulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if(a <= 0 || b <= 0 || c <= 0)
			System.out.println("invalido");
		else if(!(a>Math.abs(b-c) && a<b+c))
			System.out.println("invalido");
		else if(a == b && b == c)
			System.out.println("equilatero");
		else if(a != b && a != c && b != c)
			System.out.println("escaleno");
		else
			System.out.println("isosceles");
		
		input.close();
	}
}