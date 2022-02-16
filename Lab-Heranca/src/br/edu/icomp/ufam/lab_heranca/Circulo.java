package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica
{
	public double raio;
	
	public Circulo(int posX, int posY, double raio)
	{
		this.posX = posX;
		this.posY = posY;
		this.raio = raio;
	}
	
	public double getArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	
	public double getPerimetro()
	{
		double perimetro = 2 * Math.PI * this.raio;
		return perimetro;
	}
	
	public String toString()
	{
		String saida = "C�rculo na posi��o (" + this.posX + ", " + this.posY + ") com raio de " + this.raio + "cm (�rea=" + this.getArea() + "cm2, per�metro=" + this.getPerimetro() + "cm)";
		return saida;
	}
}
