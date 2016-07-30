package br.edu.ifpb.pps;

import br.edu.ifpb.fachada.Sistema;

public class Slot5c extends Slot{	

	public Slot5c() {
		super(Moedas.cincoC);
	}

	@Override
	public void recebeMoeda(float valor) {
		System.out.println("Slot 5c: Moeda Recebida!");
		Sistema.inserirCredito(valor);
	}

}
