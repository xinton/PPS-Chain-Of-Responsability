package br.edu.ifpb.pps;

public class Slot1c extends Slot{	

	public Slot1c() {
		super(Moedas.umC);
	}

	@Override
	public void recebeMoeda() {
		System.out.println("Slot 1c: Moeda Recebida!");
	}

}
