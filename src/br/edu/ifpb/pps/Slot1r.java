package br.edu.ifpb.pps;

import br.edu.ifpb.fachada.Sistema;

public class Slot1r extends Slot{	

	public Slot1r() {
		super(Moedas.umReal);
	}

	@Override
	public void recebeMoeda(float valor) {
		System.out.println("Slot 1R: Moeda Recebida!");
		Sistema.inserirCredito(valor);
	}

}

