package br.edu.ifpb.pps;

public class Slot50c extends Slot{	

	public Slot50c() {
		super(Moedas.cinquetaC);
	}

	@Override
	public void recebeMoeda() {
		System.out.println("Slot 25c: Moeda Recebida!");
	}

}
