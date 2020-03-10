package questao1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Livro L1;
		Repositorio R1 = new Repositorio();
		boolean reposta = true;

		System.out.println("REGISTRO DE LIVROS\n");
		do {
			System.out.println("Insira codigo do livro : ");
			String codigo = scan.nextLine();
			System.out.println("Insira titulo do livro : ");
			String titulo = scan.nextLine();
			System.out.println("Insira editora do livro : ");
			String editora = scan.nextLine();
			System.out.println("Insira valor do livro : ");
			double valor = scan.nextDouble();
			scan.nextLine();
			Livro user = new Livro(codigo,titulo,editora,valor);
	
			reposta = R1.adicionarLivro(user);
			
			if(reposta == false) {
				break;
			}
	
			System.out.println("Deseja registrar um novo livro?(s/n)");
		}while(scan.nextLine().equals("s"));

		System.out.println(R1.toString());
		
		do {
			System.out.println("\nInsira o codigo do livro a receber desconto:");
			L1 = R1.obterLivro(scan.nextLine());
		}while(L1 == null);
	
		System.out.println("Insira a taxa de desconto:");
		double desconto;
		desconto = (L1.aplicarDesconto(scan.nextDouble()));
		scan.nextLine();
		
		System.out.println(L1.toString());
		System.out.println("Valor com desconto = " + desconto);
		
	}
}
