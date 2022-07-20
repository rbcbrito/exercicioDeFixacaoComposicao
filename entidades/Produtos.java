package entidades;

public class Produtos {

	private String nome;
	private Double preco;

	public Produtos() {
	}

	public Produtos(String nome, Double preço) {
		this.nome = nome;
		this.preco = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreço() {
		return preco;
	}

	public void setPreço(Double preço) {
		this.preco = preço;
	}

}
