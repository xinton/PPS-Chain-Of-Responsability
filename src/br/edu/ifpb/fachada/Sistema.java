package br.edu.ifpb.fachada;

import br.edu.ifpb.pps.Maquina;

public class Sistema {
	private static Maquina maquina = new Maquina();
	
	public static void inicializar(){
		maquina.ligarMaquina();
	}
	
	public static void receberMoeda(float credito) throws Exception{
		maquina.receberMoeda(credito);
	}
	
	public static double getCredito(){
		return maquina.getCredito();
	}
	
	public static void inserirCredito(float valor){
		maquina.inserirCredito(valor);
	}
	 
	public static String obterProdutos(){
		return maquina.mostrarProdutos();
	}
	
	public static boolean produtoEscolhido(int escolha){
		return maquina.produtoEscolhido(escolha);
	}
}
