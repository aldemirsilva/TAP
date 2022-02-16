import java.util.Scanner;

public class FolhaPagamento {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double valorHora = input.nextDouble();
		int quantHoras = input.nextInt();
		
		double salBruto = (double) valorHora * quantHoras;
		System.out.printf("Salario bruto: R$%.2f\n", salBruto);
		System.out.printf("IR: R$%.2f\n", salBruto*0.11);
		System.out.printf("INSS: R$%.2f\n", salBruto*0.08);
		System.out.printf("Total de descontos: R$%.2f\n", salBruto*0.19);
		System.out.printf("Salario liquido: R$%.2f\n", salBruto*0.81);
		
		input.close();
	}

}
