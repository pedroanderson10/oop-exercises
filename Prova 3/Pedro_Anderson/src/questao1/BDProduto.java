package questao1;
import java.util.ArrayList;

public class BDProduto {
	private static ArrayList<Produto> array = new ArrayList<Produto>();
	
	public BDProduto() {
		super();
	}

	public static void adicionarProduto(Produto produto) {
		array.add(produto);
	}

	public static void retirarProduto(int codigoProduto) {
		for(Produto produto : array) {
			if(produto.getCodigoProduto() == codigoProduto) {
				array.remove(produto);
				//System.out.println("Produto Retirado!!!");
				break;
			}
		}
	}	

	public static Produto ProcurarProduto(int codigoProduto) throws ProdutoNaoEncontrado {
		for(Produto produto : array) {
			if(produto.getCodigoProduto() == codigoProduto) {
				return produto;
			}
		}
		throw new ProdutoNaoEncontrado(codigoProduto);
	}
	
	 public String toString(){
		 System.out.println("-----PRODUTOS DISPONIVEIS----- ");
		 for(Produto produto : array) {
			System.out.println(produto.toString());
		}
		return null;
	}

}
