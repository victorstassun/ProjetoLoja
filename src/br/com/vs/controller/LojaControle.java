package br.com.vs.controller;

import br.com.vs.model.ProdutoModel;

import java.util.List;
import java.util.Scanner;

public class LojaControle {

	private Scanner scanner;
	
	public LojaControle() {
		scanner = new Scanner(System.in);
	}
	
	public int opcao() {
		System.out.print("> ");
		return scanner.nextInt();
	}
	
	public void menu() {
		System.out.println("\n--- Menu ---\n");
		System.out.println("1) Cadastrar itens");
		System.out.println("2) Consultar estoque");
		System.out.println("3) Editar item");
		System.out.println("4) Remover item");
		System.out.println("5) Realizar venda");
		System.out.println("9) Sair do sistema");
		System.out.println("--------------------");
	}
	
	public ProdutoModel cadastrarProduto() {	
		ProdutoModel produtoModel = new ProdutoModel();
		
		System.out.println("--- CADASTRAR ITENS ---");
		System.out.print("Produto: ");
		scanner.nextLine();
		produtoModel.setNomeDoProduto(scanner.nextLine());			
		System.out.print("Preço: ");
		produtoModel.setPrecoDoProduto(scanner.nextDouble());
		System.out.print("Quantidade: ");
		produtoModel.setQuantidadeDeProduto(scanner.nextInt());
		produtoModel.setSaldoEmEstoque(
				produtoModel.getQuantidadeDeProduto()*produtoModel.getPrecoDoProduto()
				);
		
		return produtoModel;
	}
	
	public void consultarProdutos(List<ProdutoModel>produtos) {
		System.out.println("--- PRODUTOS CADASTRADOS ---");
		System.out.printf(" | %10s | %8s | %4s | %9s |\n" , "Produto", "Preço", "Quantidade", "R$ Total" );
		for (ProdutoModel produtoModel : produtos) {
			System.out.println(produtoModel);
			System.out.println("\n-------------------------\n");
		}
		System.out.println("\n-------------------------\n");
		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
	}
}
