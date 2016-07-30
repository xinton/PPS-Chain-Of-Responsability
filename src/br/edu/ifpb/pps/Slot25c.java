package br.edu.ifpb.pps;

import br.edu.ifpb.fachada.Sistema;

public class Slot25c extends Slot{	

	public Slot25c() {
		super(Moedas.vintecincoC);
	}

	@Override
	public void recebeMoeda(float valor) {
		System.out.println("Slot 25c: Moeda Recebida!");
		Sistema.inserirCredito(valor);
	}

}
