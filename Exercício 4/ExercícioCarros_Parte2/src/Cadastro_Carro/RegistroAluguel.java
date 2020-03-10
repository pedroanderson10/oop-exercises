package Cadastro_Carro;

public class RegistroAluguel {
	private Carro CarroAlugado;
	private double ValorAluguel;

	public RegistroAluguel() {
	
	};
	
	public RegistroAluguel(Carro carroAlugado, double valorAluguel) {
		super();
		this.CarroAlugado = CarroAlugado;
		this.ValorAluguel = ValorAluguel;

	}
	
	public String paraString() {
		return this.CarroAlugado.paraString()+"\nValor do aluguel: " + this.ValorAluguel;
	}

	public Carro getCarroAlugado() {
		return CarroAlugado;
	}

	public void setCarroAlugado(Carro CarroAlugado) {
		this.CarroAlugado = CarroAlugado;
	}

	public double getValorAluguel() {
		return ValorAluguel;
	}

	public void setValorAluguel(double ValorAluguel) {
		this.ValorAluguel = ValorAluguel;
	}

};
