package questao1;

public class Cerveja extends Bebida{
	public Cerveja(int codigoProduto, double valorUnitario) {
		super(codigoProduto, valorUnitario);
	}

	double obterValorUnitario() {
		return valorUnitario;
	}

	
	
}
