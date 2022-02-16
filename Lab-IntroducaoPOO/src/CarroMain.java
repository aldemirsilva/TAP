public class CarroMain {
	public static void main(String[] args) {
		Proprietario proprietario1 = new Proprietario();
		Proprietario proprietario2 = new Proprietario("Emmett L. Brown", 98008173, 1920);
		proprietario1.nome = "Aldemir";
		proprietario1.cnh = 123;
		proprietario1.anoNascimento = 1983;

		System.out.printf("%s\n", proprietario1.getDescricao());
		System.out.printf("%d\n", proprietario1.getIdade(1998));
		System.out.printf("%s\n", proprietario2.getDescricao());
		System.out.printf("%d\n", proprietario2.getIdade(1998));
		
		Placa placa = new Placa("ARS-4242",2);
		Motor motor = new Motor(4, 3.2, 200);
		Carro carro = new Carro("Ferrari", "Spider", proprietario1, placa, motor);
		System.out.println(carro.getDescricao());
		
	}
}