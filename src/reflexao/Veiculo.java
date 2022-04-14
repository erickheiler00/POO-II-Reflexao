package reflexao;

public class Veiculo {
	protected String nome;
	protected int velocidadeMaxima;
	protected int qtdPortas;
	protected String cor;
	protected int qtdLugares;
	protected Double preco;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String nome, int velocidadeMaxima, int qtdPortas, String cor,
			int qtdLugares, Double preco) {
		
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.qtdPortas = qtdPortas;
		this.cor = cor;
		this.qtdLugares = qtdLugares;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		
		if (velocidadeMaxima > 0) {
			this.velocidadeMaxima = velocidadeMaxima;
		}
		else {
			this.velocidadeMaxima = 0;
		}
		
	}
	
	public int getQtdPortas() {
		return qtdPortas;
	}
	
	public void setQtdPortas(int qtdPortas) {
		if (qtdPortas > 1) {
			this.qtdPortas = qtdPortas;
		}
		else {
			this.qtdPortas = 1;
		}
		
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getQtdLugares() {
		return qtdLugares;
	}
	
	public void setQtdLugares(int qtdLugares) {
		if (qtdLugares > 1) {
			this.qtdLugares = qtdLugares;
		}
		else {
			this.qtdLugares = 1;
		}
		
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		if(preco > 0) {
			this.preco = preco;
		}
		else {
			this.preco = 0.0;
		}
	}
}
