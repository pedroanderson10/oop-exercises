package User;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		User[] arrayUsuarios = new User[20];
		int i=1 , tam = 0;
		do {
			
			System.out.println("               CADASTRO DE MOEDAS                ");
			arrayUsuarios[i] = new User();
			arrayUsuarios[i].setNumeroMoeda(i);
			System.out.println("\nID Moeda : " + arrayUsuarios[i].getNumeroMoeda());
			System.out.println("Insira Ano de fabricacao : ");
			arrayUsuarios[i].setFabricacao(scan.nextInt());
			scan.nextLine();
			System.out.println("Insira Valor de origem : ");
			arrayUsuarios[i].setValorOrigem(scan.nextDouble());
			scan.nextLine();
			System.out.println("Insira Valor em dolar : ");
			arrayUsuarios[i].setValorDolar(scan.nextDouble());
			scan.nextLine();
			System.out.println("Insira o Pais : ");
			arrayUsuarios[i].setPais(scan.nextLine());
			System.out.println("Insira a Descricao cara : ");
			arrayUsuarios[i].setCara(scan.nextLine());
			System.out.println("Insira a Descricao coroa : ");
			arrayUsuarios[i].setCoroa(scan.nextLine());
			 		 
			System.out.println("Insira valor de cotacao atual :");
			arrayUsuarios[i].conversao(scan.nextDouble());
			scan.nextLine();
			
			i++;
			tam++;
			
			if(i==20) {
				System.out.println("Lista lotada !!!\n");
			}
			System.out.println("Deseja cadastrar uma nova moeda?"
							 + "\ns - Sim"
			 				 + "\nn - Nao");
		}while(scan.nextLine().equals("s"));
		
		System.out.println("Para obter informacoes insira o ID da moeda : ");
		int ID = scan.nextInt();
		scan.nextLine();
		i = 1;
		// System.out.println("tam = " + tam); 
		do{
			if(i > tam || ID == arrayUsuarios[i].getNumeroMoeda()) {
	
				if(i > tam ) {
					System.out.println("\nMOEDA NAO EXISTE !!!\n ");
				}else { 
					System.out.println("             Moeda         "  +
					           "\nID Moeda : "                + arrayUsuarios[i].getNumeroMoeda() + 
							   "\nAno de fabricacao: "        + arrayUsuarios[i].getFabricacao() +
							   "\nValor de origem: "          + arrayUsuarios[i].getValorOrigem() +
							   "\nValor em dolar: "           + arrayUsuarios[i].getValorDolar() +
							   "\nPais: "                     + arrayUsuarios[i].getPais() +
							   "\nDescricao cara: "           + arrayUsuarios[i].getCara() +
							   "\nDescricao coroa: "          + arrayUsuarios[i].getCoroa() +
							   "\nValor convertido em real: " + arrayUsuarios[i].getValorReal());
				}	
				System.out.println("\nDeseja buscar uma nova moeda?"
						 + "\ns - Sim"
						 + "\nn - Nao");
						
				if(scan.nextLine().equals("n")) { 
					System.out.println("\nFIM");
					break;
				}else {
					System.out.println("Para obter informacoes insira o ID da moeda : ");
					ID = scan.nextInt();
					scan.nextLine();	
				}
				
				i = 1;
				
			}else {
				i++;
			}	
				
		}while(true);

	}
}