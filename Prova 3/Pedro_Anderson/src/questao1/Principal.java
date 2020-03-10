package questao1;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ProdutoNaoEncontrado {
		Scanner scan = new Scanner(System.in);
		BDProduto BDproduto = new BDProduto(); 
		BDproduto.adicionarProduto(new Cerveja(1,5));
		BDproduto.adicionarProduto(new Baiao(2,10));
		BDproduto.adicionarProduto(new Linguica(3,15));
		BDproduto.adicionarProduto(new Sorvete(4,20));
		
		BDproduto.toString();		
		
		System.out.println("\nMONTE SEU PEDIDO");
		Pedido novoPedido = new Pedido();
		
			do {
				System.out.println("Insira o codigo do produto que deseja inserir no carrinho : ");
				int codigo = scan.nextInt();
				scan.nextLine();
				try {
					Produto produto = BDproduto.ProcurarProduto(codigo);
				
					System.out.println("Insira a quantidade de itens do produto escolhido : ");
					int quantidade = scan.nextInt(); scan.nextLine();
					ItemPedido item = new ItemPedido(produto,quantidade);
					novoPedido.adicionarItemPedido(item);
						
				}catch(ProdutoNaoEncontrado p) {
					System.out.println(p.getMessage());
				}
				System.out.println("Deseja inserir um novo item? s-SIM / n-NAO");
			}while(scan.nextLine().equals("s"));
		
			System.out.println("Valor Total do Pedido = " + novoPedido.obterValorTotalPedido());
			BDPedido BDpedido = new BDPedido();
			BDpedido.adicionarPedido(novoPedido);
		
		
		//Teste de exceção
		System.out.println("\n[EXTRA] Teste de exceção");
			try {
			Produto produto = BDproduto.ProcurarProduto(8);
		}catch(ProdutoNaoEncontrado x) {
			System.out.println(x.getMessage());
		}
		
		//Teste de Cancelar Pedido
		ControleGerencial controle = new ControleGerencial();
		novoPedido = BDPedido.ProcurarPedido(0);
		if(novoPedido == null) System.out.println("Pedido nao existente");
		else controle.cancelarPedido(novoPedido);
		
	}
}
