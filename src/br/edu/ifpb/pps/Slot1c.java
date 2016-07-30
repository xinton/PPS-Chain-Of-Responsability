package br.edu.ifpb.pps;

import br.edu.ifpb.fachada.Sistema;

public class Slot1c extends Slot{	

	public Slot1c() {
		super(Moedas.umC);
	}

	@Override
	public void recebeMoeda(float valor) {
		System.out.println("Slot 1c: Moeda Recebida!");
		Sistema.inserirCredito(valor);
	}

}
