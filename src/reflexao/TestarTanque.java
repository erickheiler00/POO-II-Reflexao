package reflexao;

public class TestarTanque {

	public static void main(String[] args) {
		Tanque tanqueTeste = new Tanque();
	    tanqueTeste.setNome("WWI Tank");
		tanqueTeste.setVelocidadeMaxima(60);
		tanqueTeste.setQtdPortas(1);
		tanqueTeste.setCor("Verde");
		tanqueTeste.setQtdLugares(4);
		tanqueTeste.setPreco(300000.00);
		tanqueTeste.setMunicao(500);
		tanqueTeste.setArmamento(true);
		System.out.println(tanqueTeste);
	}
}
