import java.util.Scanner;

public class AngryBirds {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double v0 = input.nextDouble();
		double angulo = input.nextDouble();
		double distancia = input.nextDouble();
		double r = Math.pow(v0, 2)*Math.sin(Math.toRadians(2*angulo))/9.8;
		
		if(r>=distancia-0.1 && r <= distancia+0.1)
			System.out.println('1');
		else
			System.out.println('0');

		input.close();
	}
}