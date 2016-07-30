package br.edu.ifpb.aplicacao;

import java.text.DecimalFormat;
import java.util.Scanner;

import br.edu.ifpb.fachada.Sistema;

public class Aplicacao {
	private Scanner teclado = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	
	public Aplicacao(){
		Sistema.inicializar();
		processarMenu();
	}
	
	public void processarMenu(){
		String entrada;
		int opcao;
		System.out.println("\n\n < - - - - - - - - - - - -  Máquina vendedora - - - - - - - - - - - - -> ");
		do {
			exibirMenu();
			try{
				entrada = teclado.nextLine();
				opcao = Integer.parseInt(entrada);
				switch (opcao) {
				case 0:	break;
				case 1: tarefa_inserirCredito();
				case 2: tarefa_comprarProduto();
				
				default: System.out.println("Opção Invalida !! \n");
				}
			}
			catch(NumberFormatException e)	{
				System.out.println("Digite somente número! \n");
				opcao=-1;
			}
			catch(Exception e)	{
				System.out.println("erro:" + e.getMessage());
				opcao=-1;
			}
		}while (opcao != 0);
		System.out.println("\n <---- Até Breve ---->");
	}
	
	public void exibirMenu(){
		System.out.println("\n| - - - - - - - - - - - - - - -  Menu  - - - - - - - - - - - - - - - - -|");
		System.out.println("|  [0] - Sair                                     			|");
		System.out.println("|  [1] - Inserir crédito                        			|");
		System.out.println("|  [2] - Comprar produto                         			|");
		System.out.println("| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |");
		System.out.println("  Crédito : R$ " + df.format(Sistema.getCredito())); 
		System.out.print("  Opção : ");
	}
	
	public void tarefa_inserirCredito(){			
		String valor;

		System.out.println("\n---INSERIR CREDITO---");
		System.out.println("---Só será aceito entradas com o seguintes valores---");
		System.out.println("---0.01, 0.05, 0.10, 0.25, 0.50, 1.00---");
		System.out.print("Valor(ou ENTER para voltar): ");
		valor = teclado.nextLine();
		while (!valor.equals("")) {
			try{
				Sistema.receberMoeda(Float.parseFloat(valor));
			}
			catch(NumberFormatException e){
				System.out.println("--> numero incorreto");
			}
			catch(Exception e){
				System.out.println("-->" + e.getMessage());
			}
			
			System.out.println("  Crédito : R$ " + df.format(Sistema.getCredito())); 
			System.out.print("\nValor(ou ENTER para voltar): ");
			valor = teclado.nextLine();
		}
	}
	
	public void tarefa_comprarProduto(){
		String escolha;
		String credito;
		String produtos = Sistema.obterProdutos();
		

		System.out.println("\n---Nossos Produtos---");
		System.out.println(produtos);
		System.out.println("  Crédito : R$ " + df.format(Sistema.getCredito())); 
		System.out.print("Selecionar produto(ou ENTER para voltar): ");
		escolha = teclado.nextLine();
		while (!escolha.equals("")) {
			try{
				if(Sistema.produtoEscolhido(Integer.parseInt(escolha))){
					System.out.println("\n---Produto comprado com sucesso---");
					System.out.println("---O seu troco: " + df.format(Sistema.getCredito()));
				}else{
					System.out.println("\n---Não é ainda possivel comprar esse produto---");
					System.out.println("  Crédito : R$ " + df.format(Sistema.getCredito())); 
					System.out.print("\nValor(ou ENTER para escolher outro produto): ");
					
					credito = teclado.nextLine();
					
					while(!credito.equals("")){
						
						Sistema.receberMoeda(Float.parseFloat(credito));
						
						if(Sistema.produtoEscolhido(Integer.parseInt(escolha))){
							
							System.out.println("\n---Produto comprado com sucesso---");
							System.out.println("---O seu troco\\crédito: " + df.format(Sistema.getCredito()) + "---");
							
						}else{
							System.out.println("\n---Ainda não é possivel comprar esse produto---");
							System.out.println("  Crédito : R$ " + df.format(Sistema.getCredito())); 
						}

						System.out.print("\nSelecionar outro produto(ou ENTER para voltar): ");
						credito = teclado.nextLine();
					}
					
				}
			}
			catch(NumberFormatException e){
				System.out.println("--> numero incorreto");
			}
			catch(Exception e){
				System.out.println("-->" + e.getMessage());
			}

			System.out.print("\nSelecionar produto(ou ENTER para voltar): ");
			escolha = teclado.nextLine();
		}
	}
	
	public static void main(String[] args) {
		new Aplicacao();
	}
}
