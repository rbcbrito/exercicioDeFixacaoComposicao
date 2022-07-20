package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;

public class Programa {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Cliente cli = new Cliente("Maria", "maria@gmail.com", sdf.parse("20/10/1995"));
		
		System.out.println(cli);
		
//		System.out.println("Entre com os dados do cliente: ");
//		System.out.print("Nome: ");
//		String nomeCliente = sc.nextLine();
//		System.out.print("Email: ");
//		String emailCliente = sc.nextLine();
//		System.out.print("Data de nascimento (DD/MM/YYYY): ");
//		Date dataNascimento = sdf.parse(sc.next());
//		System.out.print("Entre com os dados do pedido: ");
//		String status = sc.next();
//		
//		Cliente cliente = new Cliente(nomeCliente, emailCliente, dataNascimento);
//		
//		System.out.print("Quantos itens para esse pedido: ");
//		int n = sc.nextInt();
//		
//		ItensDoPedido itens = null;
//		
//				
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Dados do item #" + i + ": ");
//			System.out.print("Nome do Produto: ");
//			String nomeProduto = sc.nextLine();
//			System.out.print("Preço do produto: ");
//			double precoProduto = sc.nextDouble();
//			System.out.print("Quantidades do produto: ");
//			int quantidade = sc.nextInt();
//			
//			itens = new ItensDoPedido(quantidade, precoProduto, new Produtos(nomeProduto, precoProduto));
//			
//		}
//		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		Date agora = new Date();
//		dateFormat.format(agora);
//		
//		Pedidos pedidos = new Pedidos(agora, status, itens);
//		
//		
//		
//		
		
		sc.close();
		
	}

}
