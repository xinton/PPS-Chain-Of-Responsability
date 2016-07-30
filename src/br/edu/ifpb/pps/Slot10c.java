package br.edu.ifpb.pps;

import br.edu.ifpb.fachada.Sistema;

public class Slot10c extends Slot{	

	public Slot10c() {
		super(Moedas.dezC);
	}

	@Override
	public void recebeMoeda(float valor) {
		System.out.println("Slot 10c: Moeda Recebida!");
		Sistema.inserirCredito(valor);
	}

}
