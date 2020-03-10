package questao1;

public class ProdutoNaoEncontrado extends Exception {
	private int codigoProduto;
	
	public ProdutoNaoEncontrado (int codigoProduto) {
		super("O Produto de codigo " + codigoProduto + " nao esta cadastrado no sistema!!!");
		this.codigoProduto = codigoProduto;
	}
}
