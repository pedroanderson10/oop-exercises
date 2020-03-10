package User;

import java.util.Scanner;

public class User {
	private int numeroMoeda;
	private int fabricacao;
	private double valorOrigem;
	private double valorDolar;
	private String pais;
	private String cara;
	private String coroa;
	private double cotacao;
	private double valorReal;
	private int ID;
	
	
	public User() {
		
	};
	

	public User(int numeroMoeda, int fabricacao, double valorOrigem, double valorDolar, String pais, String cara,
			String coroa, double cotacao, double valorReal, int ID) {
		super();
		this.numeroMoeda = numeroMoeda;
		this.fabricacao = fabricacao;
		this.valorOrigem = valorOrigem;
		this.valorDolar = valorDolar;
		this.pais = pais;
		this.cara = cara;
		this.coroa = coroa;
		this.cotacao = cotacao;
		this.valorReal = valorReal;
		this.ID = ID;
	}
	
	
	public int getNumeroMoeda() {
		return numeroMoeda;
	}

    public void setNumeroMoeda(int numeroMoeda) {
		this.numeroMoeda = numeroMoeda;
	}

//

    
    public int getFabricacao() {
		return fabricacao;
	}

    public void setFabricacao(int fabricacao) {
		this.fabricacao = fabricacao;
	}

//


    public double getValorOrigem() {
		return valorOrigem;
	}

    public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}

//



    public double getValorDolar() {
		return valorDolar;
	}

    public void setValorDolar(double valorDolar) {
		this.valorDolar = valorDolar;
	}

//

    
    
    public String getPais() {
		return pais;
	}

    public void setPais(String pais) {
		this.pais = pais;
	}

//



    public String getCara() {
		return cara;
	}

    public void setCara(String cara) {
		this.cara = cara;
	}

//
    
    
    public String getCoroa() {
		return coroa;
	}

    public void setCoroa(String coroa) {
		this.coroa = coroa;
	}
    
	
  //  
    
    public void conversao (double cotacao) {
	 valorReal = valorDolar*cotacao;
	}
//
    
	public double getCotacao() {
		return cotacao;
	}

	public void setCotacao(double cotacao) {
		this.cotacao = cotacao;
	}

	//
	
	
	public double getValorReal() {
		return valorReal;
	}

	public void setValorReal(double valorReal) {
		this.valorReal = valorReal;
	}

	
}