import java.util.Scanner;
public class ArteAscii {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int a = 0;
		int i = 0, j = 0;
		
		while(i < num) {
			while(j < num) {
				if(j < num-1)
					System.out.print('*');
				else
					System.out.println('*');
				j++;
			}
			a++;
			j = a;
			i++;
		}

		a = num-1;
		j = a;
		i = 0;
		
		while(i < num) {
			while(j < num) {
				if(j < num-1)
					System.out.print('*');
				else
					System.out.println('*');
				j++;
			}
			a--;
			j = a;
			i++;
		}
		
		input.close();	
	}
}