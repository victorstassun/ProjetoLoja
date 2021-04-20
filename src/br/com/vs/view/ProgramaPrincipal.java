package br.com.vs.view;

import java.util.ArrayList;
import java.util.List;

import br.com.vs.controller.LojaControle;
import br.com.vs.model.ProdutoModel;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		List<ProdutoModel> produtos = new ArrayList<ProdutoModel>();
		
		//Objeto Controller do sistema
		LojaControle lojaControle = new LojaControle();
		
		//Controle do loop de saída
		boolean sair = false;
		
		do {
			lojaControle.menu();
			int opcao = lojaControle.opcao();
			
			
			switch(opcao) {
			case 1:
				produtos.add(lojaControle.cadastrarProduto());
				break;
			case 2:
				lojaControle.listarProdutos(produtos);
				break;		
			case 3:
				lojaControle.editarProduto(produtos);
				break;
			case 9:
				sair = true;
				break;
				
			default:
				System.out.println("Opção Inválida!!!");
				break;
			
			}
		} while(!sair);
		
		System.out.println("Sistema Encerrado!!!");
	}

}
