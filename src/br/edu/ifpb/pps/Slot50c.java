package br.edu.ifpb.pps;

import br.edu.ifpb.fachada.Sistema;

public class Slot50c extends Slot{	

	public Slot50c() {
		super(Moedas.cinquetaC);
	}

	@Override
	public void recebeMoeda(float valor) {
		System.out.println("Slot 25c: Moeda Recebida!");
		Sistema.inserirCredito(valor);
	}

}
