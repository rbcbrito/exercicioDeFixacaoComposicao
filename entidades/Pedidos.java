package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusDosPedidos;

public class Pedidos {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
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

	public void adicionaItem(ItensDoPedido item) {
		itens.add(item);
	}
	
	public void removeItem(ItensDoPedido item) {
		itens.remove(item);
	}
	
	public Double total() {
		double soma = 0.0;
		for(ItensDoPedido idp : itens) {
			soma += idp.subTotal();
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido:\n");
		for(ItensDoPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
