package br.edu.ifpb.pps;

public class Slot1r extends Slot{	

	public Slot1r() {
		super(Moedas.umReal);
	}

	@Override
	public void recebeMoeda() {
		System.out.println("Slot 1R: Moeda Recebida!");
	}

}

