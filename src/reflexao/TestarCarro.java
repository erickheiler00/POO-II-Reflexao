package reflexao;

public class TestarCarro {

	public static void main(String[] args) {
		Carro carroTeste = new Carro();
		carroTeste.setNome("Celta");
		carroTeste.setVelocidadeMaxima(200);
		carroTeste.setQtdPortas(4);
		carroTeste.setCor("Prata");
		carroTeste.setQtdLugares(5);
		carroTeste.setPreco(18000.00);
		System.out.println(carroTeste);
	}
}
