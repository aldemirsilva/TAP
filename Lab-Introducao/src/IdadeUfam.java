import java.util.Scanner;

public class IdadeUfam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		num = num - 1909;
		
		System.out.printf("A UFAM tem " + num + " anos de fundacao");
		
		scan.close();
	}

}