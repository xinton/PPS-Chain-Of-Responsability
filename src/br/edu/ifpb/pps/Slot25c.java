package br.edu.ifpb.pps;

public class Slot25c extends Slot{	

	public Slot25c() {
		super(Moedas.vintecincoC);
	}

	@Override
	public void recebeMoeda() {
		System.out.println("Slot 25c: Moeda Recebida!");
	}

}
