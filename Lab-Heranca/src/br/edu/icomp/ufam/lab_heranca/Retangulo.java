package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica
{
	public double largura, altura;
	
	public Retangulo(int posX, int posY, double largura, double altura)
	{
		this.posX = posX;
		this.posY = posY;
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getArea()
	{
		double area = largura * altura;
		return area;
	}
	
	public double getPerimetro()
	{
		double perimetro = 2 * (largura + altura);
		return perimetro;
	}
	
	public String toString() {
		String saida = "Ret�ngulo na posi��o (" + this.posX + ", " + this.posY + ") com largura de " + this.largura + "cm e altura de " + this.altura + "cm (�rea=" + this.getArea() + "cm2, per�metro=" + this.getPerimetro() + "cm)";
		return saida;
	}
}
