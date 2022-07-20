package entidades;

public class ItensDoPedido {

	private Integer quantidade;
	private Double preco;

	private Produtos produto;

	public ItensDoPedido() {
	}

	public ItensDoPedido(Integer quantidade, Double preco, Produtos produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produtos getProduto() {
		return produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}

	public Double subTotal() {
		return this.quantidade * this.preco;
	}

}
