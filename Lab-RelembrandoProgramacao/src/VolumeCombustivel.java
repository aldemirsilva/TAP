import java.util.Scanner;

public class VolumeCombustivel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double H = input.nextDouble();
		double h = input.nextDouble();
		double r = input.nextDouble();
		
		if(H <= 0 || h <= 0 || r <= 0)
			System.out.printf("%.3f", -1.000);
		else if(h <= r)
			System.out.printf("%.3f", Math.PI / 3.0 * Math.pow(h, 2) * (3 * r - h));
		else if(h > r && h <= (H - r))
			System.out.printf("%.3f", 2.0 / 3.0 * Math.PI * Math.pow(r, 3) + Math.PI * Math.pow(r, 2) * (h - r));
		else if (h > (H - r))
			System.out.printf("%.3f", (4.0 / 3.0 * Math.PI * Math.pow(r, 3)) + (Math.PI * Math.pow(r, 2) * (h - r)) - (Math.PI / 3.0 * Math.pow((H - h), 2) * (3 * r - (H - h) )));
		else if(h == H)
			System.out.printf("%.3f", (4.0 / 3.0 * Math.PI * Math.pow(r, 3)) + (Math.PI * Math.pow(r, 2) * (H - 2 * r)));
		
		input.close();
	}
}