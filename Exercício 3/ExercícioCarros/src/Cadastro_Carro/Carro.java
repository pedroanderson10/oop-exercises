package Cadastro_Carro;


public class Carro {
	private int ID;
	private String Placa;
	private String Modelo;
	private double ValorDiaria;
	
	public Carro() {
		
	};
	

	public Carro(int ID ,String Placa, String Modelo, double ValorDiaria) {
		super();
		this.ID = ID;
		this.Placa = Placa;
		this.Modelo = Modelo;
		this.ValorDiaria = ValorDiaria;

	}
	
	public double obterValorAluguel(double quantidadeDias) {
		 return quantidadeDias*ValorDiaria;
	
	}
	
	public boolean equals(Carro Carro) {
		return this.Placa.equals(Carro.Placa);
	}
	
	public String paraString() {
		return "     CARRO " + this.ID + " ESCOLHIDO" + "\nPlaca do carro: " + this.Placa + "\nModelo do carro: " + this.Modelo + "\nValor da Diaria: " + this.ValorDiaria;
	}	


	public void setID(int ID) {
		this.ID = ID;
	}
	public int getID() {
		return ID;
	}


	
	public void setPlaca(int ID) {
		this.ID = ID;
	}

	public String getPlaca() {
		return Placa;
	}


	public void setPlaca(String Placa) {
		this.Placa = Placa;
	}


	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}


	public double getValorDiaria() {
		return ValorDiaria;
	}


	public void setValorDiaria(double ValorDiaria) {
		this.ValorDiaria = ValorDiaria;
	}
	

}