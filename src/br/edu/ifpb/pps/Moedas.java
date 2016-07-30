package br.edu.ifpb.pps;

public enum Moedas {
	umC(0.01f), 
	cincoC(0.05f),
	dezC(0.10f), 
	vintecincoC(0.25f), 
	cinquetaC(0.50f), 
	umReal(1f);
	
	private float valor;
	
	Moedas(float valor) {
        this.valor = valor;
    }
	
	public float getMoedas(){
		return valor;
	}
}
