package br.edu.ifpb.pps;

import java.util.ArrayList;

public class Maquina {
	private ArrayList<Produto> produtos;
	private Slot slots;
	private double credito;
	
	
	public Maquina(){
		this.slots = new Slot1c();
		this.produtos = new ArrayList<Produto>();
		this.credito = 0;
	}
	
	public void ligarMaquina(){
		carregarSlots();
		carregarProdutos();
	}
	
	public void carregarSlots(){
		slots.setNextSlot(new Slot5c());
		slots.setNextSlot(new Slot10c());
		slots.setNextSlot(new Slot25c());
		slots.setNextSlot(new Slot50c());
		slots.setNextSlot(new Slot1r());
	}
	
	public void receberMoeda(float moeda) throws Exception{
		slots.receberMoeda(moeda);
	}
	
	public void carregarProdutos(){
		produtos.add(new Produto("Coca Cola Lata 250ml", 1.59));
		produtos.add(new Produto("Pepsi Lata 350ml", 1.99));
		produtos.add(new Produto("Kuat Lata 350ml", 1.65));
		produtos.add(new Produto("Amendoim Descascado YOKI Pacote 500g", 8.79));
		produtos.add(new Produto("Amendoim Colorido Dori Pacote 500g", 4.49));
		produtos.add(new Produto("Amendoim Mendorato Pacote 500g", 11.90));
	}
	
	public String mostrarProdutos(){
		
		String result = "";
		
		for(int i = 1; i <= produtos.size(); i++){
			result += i + " - " + produtos.get(i - 1).getNome() + " - " + produtos.get(i - 1).getPreco() + "\n";
		}
		
		return result;
		
	}
	
	public boolean produtoEscolhido(int escolha){
		double preco = produtos.get((escolha - 1)).getPreco();
		
		if(preco <= credito ){
			credito -= preco;
			return true;
		}
		
		return false;
	}
	
	public void inserirCredito(float credito){
		this.credito += credito;
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public Slot getSlots() {
		return slots;
	}

	public void setSlots(Slot slots) {
		this.slots = slots;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		this.credito = credito;
	}
}
