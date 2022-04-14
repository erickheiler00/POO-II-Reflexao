package reflexao;

public class Carro extends Veiculo{
	
	public Carro() {
		
	}
	
	@Override
	public String toString() {
		return "Carro [nome = " + nome + ", velocidadeMaxima = " + 
				velocidadeMaxima + ", qtdPortas = " + qtdPortas 
				+ ", cor = " + cor + ", qtdLugares = " + qtdLugares + 
				", preco = " + preco + "]";
	}
}
	

