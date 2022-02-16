import java.util.Scanner;

public class DataExtenso {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int data = input.nextInt();
		String mes = null;
		
		int ano = data % 10000;
		data /= 10000;
		
		int mesNum = data % 100;
		data /= 100;
		
		int dia = data % 100;
		
		switch(mesNum) {
		case 1:
			mes = "janeiro";
			break;
		case 2:
			mes = "fevereiro";
			break;
		case 3:
			mes = "marco";
			break;
		case 4:
			mes = "abril";
			break;
		case 5:
			mes = "maio";
			break;
		case 6:
			mes = "junho";
			break;
		case 7:
			mes = "julho";
			break;
		case 8:
			mes = "agosto";
			break;
		case 9:
			mes = "setembro";
			break;
		case 10:
			mes = "outubro";
			break;
		case 11:
			mes = "novembro";
			break;
		case 12:
			mes = "dezembro";
			break;
		}
		input.close();
		System.out.println(dia + " de " + mes + " de " + ano);
	}
}