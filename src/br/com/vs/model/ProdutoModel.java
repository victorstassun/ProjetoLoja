package br.com.vs.model;

public class ProdutoModel {

	//	ATRIBUTOS

	private String nomeDoProduto;
	private double precoDoProduto;
	private int quantidadeDeProduto;
	private double saldoEmEstoque;
		
	//	CONSTRUTURES 
	
	public ProdutoModel() {
		
	}
	
	public ProdutoModel(String nomeDoProduto, double precoDoProduto, int quantidadeDeProduto, double saldoEmEstoque) {
		super();
		this.nomeDoProduto = nomeDoProduto;
		this.precoDoProduto = precoDoProduto;
		this.quantidadeDeProduto = quantidadeDeProduto;
		this.saldoEmEstoque = saldoEmEstoque;
	}

	//	METODOS
	
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public double getPrecoDoProduto() {
		return precoDoProduto;
	}
	public void setPrecoDoProduto(double precoDoProduto) {
		this.precoDoProduto = precoDoProduto;
	}
	public int getQuantidadeDeProduto() {
		return quantidadeDeProduto;
	}
	public void setQuantidadeDeProduto(int quantidadeDeProduto) {
		this.quantidadeDeProduto = quantidadeDeProduto;
	}
	public double getSaldoEmEstoque() {
		return saldoEmEstoque;
	}
	public void setSaldoEmEstoque(double saldoEmEstoque) {
		this.saldoEmEstoque = saldoEmEstoque;
	}

	
}
