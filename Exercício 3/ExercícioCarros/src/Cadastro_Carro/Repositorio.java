package Cadastro_Carro;

public class Repositorio {
	static Carro[] arrayCarros = new Carro[20];
	static int num_carros = 0;
	
	public Repositorio() {
		super();
	}
	
	public Carro getCarros(String PLACA) {
		
		for(int i = 0; i < num_carros; i++) 
			if(arrayCarros[i].getPlaca().equals(PLACA) ) 
				return arrayCarros[i];
			
		System.out.println("Placa nao encontrada");
		return null;
	}

	public void setCarros(Carro obj_carro) {
		if(num_carros < 20) {
			arrayCarros[num_carros] = obj_carro;
			num_carros++;
		}else {
			System.out.println("\nLista cheia");
		}
	}
}
