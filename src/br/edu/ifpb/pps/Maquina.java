package br.edu.ifpb.pps;

public class Maquina {

	public static void main(String[] args) throws Exception {
		Slot slots = new Slot1c();
		slots.setNextSlot(new Slot5c());
		slots.setNextSlot(new Slot10c());
		slots.setNextSlot(new Slot25c());
		
		double valorInserido = 0;	
		
		//TODO pedir via console qual produto.
		Produto produto = new Produto(0.55);
		
		while( valorInserido < produto.getPreco() ){
			System.out.println("Inserir moeda");
			//TODO pedir via console qual moeda por.
			slots.receberMoeda(Moedas.vintecincoC);
			valorInserido += 0.25;
			if( valorInserido > produto.getPreco() ){
				System.out.println( "Troco: " + String.format( "%.2f", (valorInserido - produto.getPreco()) ) );
			}
		}
		
		System.out.println("Finalizada compra");
		
//		try {
//			System.out.println("Exemplo: moeda de 25c");
//			slots.receberMoeda(Moedas.vintecincoC);
//			System.out.println();
//			
//			System.out.println("Exemplo: moeda de 10c");
//			slots.receberMoeda(Moedas.dezC);
//			System.out.println();
//
//			System.out.println("Exemplo: moeda de 1c");
//			slots.receberMoeda(Moedas.umC);
//			System.out.println();
//
//			System.out.println("Exemplo: moeda de 5c");
//			slots.receberMoeda(Moedas.cincoC);	
//			System.out.println();
//
//	    } catch (Exception e) {
//	        e.printStackTrace();
//	    }

	}

}
