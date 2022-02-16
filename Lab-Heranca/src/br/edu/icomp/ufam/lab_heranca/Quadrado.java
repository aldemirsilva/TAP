package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo
{
	public Quadrado(int posX, int posY, double lado)
	{
		 super(posX, posY, lado, lado);
	}

	@Override
	public String toString()
	{
		String saida = "Quadrado na posi��o (" + super.posX + ", " + super.posY + ") com lado de " + super.largura + "cm (�rea=" + super.getArea() + "cm2, per�metro=" + super.getPerimetro() + "cm)";
		return saida;
	}
}