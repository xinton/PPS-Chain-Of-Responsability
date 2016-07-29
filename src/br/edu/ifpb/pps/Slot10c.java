package br.edu.ifpb.pps;

public class Slot10c extends Slot{	

	public Slot10c() {
		super(Moedas.dezC);
	}

	@Override
	public void recebeMoeda() {
		System.out.println("Slot 10c: Moeda Recebida!");
	}

}
