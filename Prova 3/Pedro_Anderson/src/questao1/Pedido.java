package questao1;
import java.util.ArrayList;

public class Pedido {
	static ArrayList<ItemPedido> array = new ArrayList<ItemPedido>();
	static boolean cancelado;
	
	public Pedido() {
		super();
	}

	public static void adicionarItemPedido(ItemPedido ItemPedido) {
		array.add(ItemPedido);
	}
	
	public double obterValorTotalPedido() {
		double soma = 0;
		for(int i = 0 ; i < array.size() ; i++) {
			ItemPedido item = array.get(i);
			Produto produto = item.getProduto();
			soma = soma + item.obterValorItem(produto);
		}
		return soma;
	}
	
}
