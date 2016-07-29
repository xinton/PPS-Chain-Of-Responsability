package br.edu.ifpb.pps;

public class Produto {
	private String nome;
	private double preco;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public Produto(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

}
