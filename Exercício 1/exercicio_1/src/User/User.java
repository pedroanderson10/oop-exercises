package User;

import java.util.Scanner;

public class User {
	int ID,Idade;
	String Nome,Sobrenome,Cargo,NovoCargo;
	double Salario, Aumento , NovoSalario;
	
	Scanner scan = new Scanner(System.in);
	
public void Promover (double porcentagem) {
	 Salario += Salario*(porcentagem/100);
	}
	
}

