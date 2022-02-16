import java.util.Scanner;

public class RotaOrtodromica {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double t1 = input.nextDouble();
		double g1 = input.nextDouble();
		double t2 = input.nextDouble();
		double g2 = input.nextDouble();
		double raio = 6371;
		double d = raio * Math.acos(Math.sin(Math.toRadians(t1))*Math.sin(Math.toRadians(t2))+Math.cos(Math.toRadians(t1))*Math.cos(Math.toRadians(t2))*Math.cos(Math.toRadians(g1-g2)));
		
		System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km", t1, g1, t2, g2, d);
		
		input.close();
	}
}