import java.util.Scanner;

public class DataExtenso2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String valorStr = input.next();
		String diaStr = valorStr.substring(0, 2);
		String mesStr = valorStr.substring(2, 4);
		String anoStr = valorStr.substring(4, 8);
		
		int dia = Integer.parseInt(diaStr);
		int mes= Integer.parseInt(mesStr);
		
		switch(mes) {
		case 1:
			mesStr = "janeiro";
			break;
		case 2:
			mesStr = "fevereiro";
			break;
		case 3:
			mesStr = "marco";
			break;
		case 4:
			mesStr = "abril";
			break;
		case 5:
			mesStr = "maio";
			break;
		case 6:
			mesStr = "junho";
			break;
		case 7:
			mesStr = "julho";
			break;
		case 8:
			mesStr = "agosto";
			break;
		case 9:
			mesStr = "setembro";
			break;
		case 10:
			mesStr = "outubro";
			break;
		case 11:
			mesStr = "novembro";
			break;
		case 12:
			mesStr = "dezembro";
			break;
		}
		input.close();
		System.out.println(dia + " de " + mesStr + " de " + anoStr);
	}
}
