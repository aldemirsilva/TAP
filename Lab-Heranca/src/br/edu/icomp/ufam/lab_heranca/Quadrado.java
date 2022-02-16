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
		String saida = "Quadrado na posição (" + super.posX + ", " + super.posY + ") com lado de " + super.largura + "cm (área=" + super.getArea() + "cm2, perímetro=" + super.getPerimetro() + "cm)";
		return saida;
	}
}