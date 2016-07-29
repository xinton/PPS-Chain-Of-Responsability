package br.edu.ifpb.pps;

public class Maquina {
		
	public static void main(String[] args) {
		Slot slots = new Slot1c();
		slots.setNextSlot(new Slot5c());
		slots.setNextSlot(new Slot10c());
		slots.setNextSlot(new Slot25c());
		
		try {
			System.out.println("Exemplo: moeda de 25c");
			slots.receberMoeda(Moedas.vintecincoC);
			System.out.println();
			
			System.out.println("Exemplo: moeda de 10c");
			slots.receberMoeda(Moedas.dezC);
			System.out.println();

			System.out.println("Exemplo: moeda de 1c");
			slots.receberMoeda(Moedas.umC);
			System.out.println();

			System.out.println("Exemplo: moeda de 5c");
			slots.receberMoeda(Moedas.cincoC);	
			System.out.println();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	}
	
//	public void construirMaquina(Slot slots){
//		slots.setNextSlot(new Slot5c());
//		slots.setNextSlot(new Slot10c());
//		slots.setNextSlot(new Slot25c());
//		
//	}
	
	

}
