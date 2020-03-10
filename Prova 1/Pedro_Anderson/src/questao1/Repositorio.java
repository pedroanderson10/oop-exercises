package questao1;

import java.util.Arrays;

public class Repositorio {
	 private Livro[] arrayLivros = new Livro[10];

	public String toString() {
		return "\n" + Arrays.toString(arrayLivros);
	}
	
	public Livro obterLivro(String codigo) {
		for(int i = 0 ; i < 10 ; i++) {
			if(arrayLivros[i] != null && arrayLivros[i].getCodigo().equals(codigo)) {
				return arrayLivros[i];
			}
		}
		return null;
	}
	
	public boolean adicionarLivro(Livro livro) {
		for(int i = 0 ; i < 10 ; i++) {
			if(arrayLivros[i] == null) {
				arrayLivros[i] = livro;
				return true;
			}
		}
		System.out.println("LISTA CHEIA");
		return false;
	}
	
}
