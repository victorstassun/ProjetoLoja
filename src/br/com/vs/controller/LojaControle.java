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
	
	public List<ProdutoModel> listarProdutos(List<ProdutoModel>produtos) {
		System.out.println("--- PRODUTOS CADASTRADOS ---");
		System.out.printf(" | %10s | %8s | %4s | %9s |\n" , "Produto", "Preço", "Quantidade", "R$ Total" );
			
		produtos.forEach(produto -> {
				System.out.printf("| %10s | %8s | %4s | %9s |\n");
					produto.getNomeDoProduto();
					produto.getPrecoDoProduto();
					produto.getQuantidadeDeProduto();
					produto.getSaldoEmEstoque();
					
			});

		return produtos;
		}
	
	public ProdutoModel editarProduto(List<ProdutoModel>produtos) {
		ProdutoModel produto = new ProdutoModel();
		int IdDoProduto, indexDoCampo;
		
		System.out.println("--- EDITAR DADOS DE PRODUTO ---");
		System.out.print("Informe o ID do produto: ");
		IdDoProduto = scanner.nextInt();
		
		System.out.println("--- CAMPOS ---");
		System.out.println("1) Nome do produto");
		System.out.println("2) Preço unitário");
		System.out.println("3) Quantidade");
		System.out.print("Informe o campo que deseja editar: ");
		indexDoCampo = scanner.nextInt();
		
		switch (indexDoCampo) {
		
		case 1: 
			System.out.println("Informe o novo nome para o produto: ");
			produto.setNomeDoProduto(scanner.next());
			
			produto.setPrecoDoProduto(produtos.get(IdDoProduto).getPrecoDoProduto());
			produto.setQuantidadeDeProduto(produtos.get(IdDoProduto).getQuantidadeDeProduto());
			produto.setSaldoEmEstoque(produtos.get(IdDoProduto).getSaldoEmEstoque());
			
			produtos.set(IdDoProduto, produto);
			break;
		
		default: 
				
			break;
		}
		
		return null;
	}
}

