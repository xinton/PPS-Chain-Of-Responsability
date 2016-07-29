package br.edu.ifpb.pps;

public abstract class Slot {
	
	protected Slot nextSlot;
	protected Moedas moedaAceita;
	
	public abstract void recebeMoeda();
	
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
	
	public void receberMoeda(Moedas moedaInserida) throws Exception{
		if( podeReceber(moedaInserida) ){
			recebeMoeda();
		}
		else{
			if(nextSlot == null) {
				throw new Exception("Slot inexistente");
			}
			System.out.println("Nao pode receber a moeda de "+ moedaInserida +", passar pra prox slot de moedas");
			this.nextSlot.receberMoeda(moedaInserida);
		}
	}
	
	public boolean podeReceber(Moedas moedaInserida){
		if (moedaAceita == moedaInserida ){
			return true;
		}
		return false;
	}

}
