package br.edu.ifpb.pps;

public class Slot5c extends Slot{	

	public Slot5c() {
		super(Moedas.cincoC);
	}

	@Override
	public void recebeMoeda() {
		System.out.println("Slot 5c: Moeda Recebida!");
	}

}
