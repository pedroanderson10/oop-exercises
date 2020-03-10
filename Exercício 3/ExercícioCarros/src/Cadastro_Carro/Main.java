package Cadastro_Carro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner         scan    = new Scanner(System.in);
		Repositorio     vetor   = new Repositorio();
		RegistroAluguel aluguel = new RegistroAluguel();
		Carro           car     = new Carro();
	 
		do {	
			System.out.println("               CADASTRO DE CARROS                ");
			
			car.setID(Repositorio.num_carros + 1);
			System.out.println("\nID: " + car.getID());
			
			System.out.println("Insira Placa : ");
			car.setPlaca(scan.nextLine());
			
			System.out.println("Insira Modelo : ");
			car.setModelo(scan.nextLine());
			
			System.out.println("Insira Valor da diaria : ");
			car.setValorDiaria(scan.nextDouble());
			scan.nextLine();
			
			vetor.setCarros(car);
			
			System.out.println("Deseja cadastrar um novo carro?"
							 + "\ns - Sim"
			 				 + "\nn - Nao");
		}while(scan.nextLine().equals("s"));
	
		do 
			System.out.println("Insira placa do carro que deseja adquirir: ");
		while((car = vetor.getCarros(scan.nextLine())) == null);
		
		aluguel.setCarroAlugado(car);
		
		System.out.println("Insira quantidade de dias de aluguel : ");
		aluguel.setValorAluguel(car.obterValorAluguel(scan.nextInt()));
		scan.nextLine();
		
		System.out.println(aluguel.paraString());
					
	}
}