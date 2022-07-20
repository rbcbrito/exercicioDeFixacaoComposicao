package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusDosPedidos;

public class Pedidos {
	
	private Date momento;
	private StatusDosPedidos status;
	
	private Cliente cliente;
	private List<ItensDoPedido> itens = new ArrayList<>();
	
	public Pedidos() {
	}

	public Pedidos(Date momento, StatusDosPedidos status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusDosPedidos getStatus() {
		return status;
	}

	public void setStatus(StatusDosPedidos status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItensDoPedido> getItensDoPedido() {
		return itens;
	}

	public void adicionaItem(ItensDoPedido item) {
		itens.add(item);
	}
	
	public void removeItem(ItensDoPedido item) {
		itens.remove(item);
	}
	
	public Double total() {
		double soma = 0;;
		for(ItensDoPedido idp : itens) {
			soma += idp.subTotal();
		}
		return soma;
	}
	
}
