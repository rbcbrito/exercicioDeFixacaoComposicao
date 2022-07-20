package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItensDoPedido;
import entidades.Pedidos;
import entidades.Produtos;
import entidades.enums.StatusDosPedidos;

public class Programa {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Email: ");
		String emailCliente = sc.next();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date dataNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nomeCliente, emailCliente, dataNascimento);
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		StatusDosPedidos status = StatusDosPedidos.valueOf(sc.next());
		
		Pedidos pedido = new Pedidos(new Date(), status, cliente);
		
		System.out.print("Quantos itens para esse pedido: ");
		int n = sc.nextInt();	
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do item #" + i + ": ");
			System.out.print("Nome do Produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantidades do produto: ");
			int quantidade = sc.nextInt();
			
			ItensDoPedido itens = new ItensDoPedido(quantidade, precoProduto, new Produtos(nomeProduto, precoProduto));
			pedido.adicionaItem(itens);
		}
		
		System.out.println();
		System.out.println(pedido);
		
		sc.close();
		
	}

}
