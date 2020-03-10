package questao1;

public abstract class Produto implements Gerenciavel{
	protected int codigoProduto;
	protected double valorUnitario;
	
	public Produto() {

	}
	
	public Produto(int codigoProduto, double valorUnitario) {
		super();
		this.codigoProduto = codigoProduto;
		this.valorUnitario = valorUnitario;
	}
	
	public String toString() {
		return "\nCodigo do Produto = " + codigoProduto + "\nValor Unitario = " + valorUnitario;
	}

	abstract double obterValorUnitario();
	public void cancelarPedido(Pedido pedido) {
		
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	
	 
}
