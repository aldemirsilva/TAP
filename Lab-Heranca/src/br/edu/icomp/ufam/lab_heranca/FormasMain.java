package br.edu.icomp.ufam.lab_heranca;
import java.util.*;

public class FormasMain
{
	public static void main(String[] args)
	{
		ArrayList<FormaGeometrica> lista = new ArrayList<FormaGeometrica>();
		Circulo c1 = new Circulo(2,3,44.0);
		Quadrado q1 = new Quadrado(-4,1,12.6);
		Retangulo r1 = new Retangulo(4,-3,42.0,19.0);
		
		lista.add(c1);
		lista.add(q1);
		lista.add(r1);
		
		for(int i = 0; i < lista.size(); i++)
			System.out.println(lista.get(i));
	}
}