package br.edu.ifpb.pps;

public abstract class Slot {
	
	protected Slot nextSlot;
	protected Moedas moedaAceita;
	
	public abstract void recebeMoeda();
	
	public Slot(Moedas valor) {
		this.nextSlot = null;
		this.moedaAceita = valor;
	}
	
	public void setNextSlot(Slot nextSlot) {
		if(nextSlot == null){
			this.nextSlot = nextSlot;
		} else {
			this.nextSlot.setNextSlot(nextSlot);
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
