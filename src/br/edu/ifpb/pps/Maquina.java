package br.edu.ifpb.pps;

import java.util.ArrayList;

public class Maquina {
	private ArrayList<Produto> produtos;
	private Slot slots;
	
	public Maquina(){
		this.slots = new Slot1c();
		this.produtos = new ArrayList<Produto>();
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
		
		for(int i = 0; i < produtos.size(); i++){
			result += i + " - " + produtos.indexOf(i) + "\n";
		}
		
		return result;
		
	}
}
