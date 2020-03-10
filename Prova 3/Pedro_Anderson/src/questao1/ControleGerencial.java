package questao1;

public class ControleGerencial implements Gerenciavel {
	public void cancelarPedido(Pedido pedido) {
		pedido.cancelado = true;
	}

}
