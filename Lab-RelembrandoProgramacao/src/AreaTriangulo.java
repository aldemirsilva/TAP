import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if(!(a>Math.abs(b-c) && a<b+c))
			System.out.println("Triangulo invalido");
		else {
			double s = (a+b+c)/2;
			double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.printf("%.2f", area);
		}
		input.close();
	}
}