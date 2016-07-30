package br.edu.ifpb.pps;

import java.text.DecimalFormat;

public abstract class Slot {
	
	protected Slot nextSlot;
	protected Moedas moedaAceita;
	DecimalFormat df = new DecimalFormat("0.00");
	
	public abstract void recebeMoeda(float valor);
	
	public Slot(Moedas valor) {
		this.nextSlot = null;
		this.moedaAceita = valor;
	}
	
	public void setNextSlot(Slot slot) {
		if(nextSlot == null){
			nextSlot = slot;
		} else {
			nextSlot.setNextSlot(slot);
		}
	}
	
	public void receberMoeda(float moedaInserida) throws Exception{
		if( podeReceber(moedaInserida) ){
			recebeMoeda(moedaInserida);
		}
		else{
			if(nextSlot == null) {
				throw new Exception("Slot inexistente");
			}
			System.out.println("O slot de " + df.format(moedaAceita.getMoedas()) + " é incapaz de receber a moeda de valor de R$ "+ df.format(moedaInserida) + ".");
			System.out.println("Moeda passada para o próximo slot.");
			this.nextSlot.receberMoeda(moedaInserida);
		}
	}
	
	public boolean podeReceber(float moedaInserida){
		if (moedaAceita.getMoedas() == moedaInserida ){
			return true;
		}
		return false;
	}

}
