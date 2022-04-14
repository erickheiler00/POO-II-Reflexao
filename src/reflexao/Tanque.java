package reflexao;

public class Tanque extends Veiculo{
	protected int municao;
	protected boolean armamento;
	
	public Tanque() {
		
	}

	public Tanque(int municao, boolean armamento) {
		this.municao = municao;
		this.armamento = armamento;
	}
	
	@Override
	public String toString() {
		return "Tanque [nome = " + nome + ", velocidadeMaxima = " 
				+ velocidadeMaxima + ", qtdPortas = " + qtdPortas 
				+ ", cor = " + cor + ", qtdLugares = " + qtdLugares 
				+ ", preco = " + preco + ", municao = " + municao 
				+ ", armamento = " + armamento + "]";
	}

	public int getMunicao() {
		return municao;
	}

	public void setMunicao(int municao) {
		this.municao = municao;
	}

	public boolean getArmamento() {
		return armamento;
	}

	public void setArmamento(boolean armamento) {
		this.armamento = armamento;
	}
}