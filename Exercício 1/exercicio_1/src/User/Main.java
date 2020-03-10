package User;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		User[] arrayUsuarios = new User[5];
		int i = 0;
		
		do {
			
			System.out.println("               CADASTRO                ");
			arrayUsuarios[i] = new User();
			//System.out.println("Insira ID : ");
			arrayUsuarios[i].ID = i + 1;
			System.out.println("Insira idade : ");
			arrayUsuarios[i].Idade = scan.nextInt();
			scan.nextLine();
			System.out.println("Insira nome : ");
			arrayUsuarios[i].Nome = scan.nextLine();
			System.out.println("Insira sobrenome : ");
			arrayUsuarios[i].Sobrenome = scan.nextLine();
			System.out.println("Insira cargo : ");
			arrayUsuarios[i].Cargo = scan.nextLine();
			System.out.println("Insira salario: ");
			arrayUsuarios[i].Salario = scan.nextDouble();
			scan.nextLine();
			 
			System.out.println("Deseja promover este usuário?"
							 + "\ns - Sim"
						     + "\nn - Não");		 
			if(scan.nextLine().equals("s")) {
				System.out.println("Insira porcentagem de aumento de salario :");
				arrayUsuarios[i].Promover(scan.nextInt());
				scan.nextLine();
			}
			i++;
			
			System.out.println("Deseja cadastrar um novo usuário?"
							 + "\ns - Sim"
			 				 + "\nn - Não");
		}while(scan.nextLine().equals("s"));
		
		for(int j=0 ; j < i ; j++) { 
		System.out.println("             USUARIO         " +
				           "\nID: "        + arrayUsuarios[j].ID + 
						   "\nIdade: "     + arrayUsuarios[j].Idade +
						   "\nNome: "      + arrayUsuarios[j].Nome +
						   "\nSobrenome: " + arrayUsuarios[j].Sobrenome +
						   "\nCargo: "     + arrayUsuarios[j].Cargo +
						   "\nSalario: "   + arrayUsuarios[j].Salario);
		}

	}
}