package br.edu.icomp.ufam.lab_heranca;

public abstract class FormaGeometrica
{
	public int posX, posY;
	
	FormaGeometrica()
	{
		this(0,0);
	}

	public FormaGeometrica(int posX, int posY)
	{
		this.posX = posX;
		this.posY = posY;
	}

	public abstract double getArea();
	
	public abstract double getPerimetro();

	public String getPosString()
	{
		String saida = "posição (" + this.posX + ", " + this.posY + ')';
		return saida;
	}
}
