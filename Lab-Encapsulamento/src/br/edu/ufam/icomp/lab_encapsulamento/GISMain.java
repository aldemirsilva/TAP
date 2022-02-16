package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
	public static void main(String[] args) {
		Localizavel[] vetorLocalizaveis = new Localizavel[2];
		Posicao p1 = new Posicao(-3.089242, -59.964874, 88.374);
		System.out.println(p1.toString());

		Celular c1 = new Celular(55,10,999999999);
		System.out.println(c1.getPosicao().toString());
		System.out.println(c1.getErroLocalizacao());

		CarroLuxuoso c2 = new CarroLuxuoso("DEV11666");
		System.out.println(c2.placa);
		System.out.println(c2.getPosicao().toString());
		System.out.println(c2.getErroLocalizacao());

		vetorLocalizaveis[0] = c1;
		vetorLocalizaveis[1] = c2;
		
		for(Localizavel element : vetorLocalizaveis) {
			System.out.println(element.getPosicao().toString());
		}
	}
}