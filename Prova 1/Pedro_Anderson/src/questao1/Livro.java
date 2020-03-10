package questao1;

public class Livro {
	private String codigo;
	private String titulo;
	private String editora;
	private double valor;
	
	public Livro(String codigo, String titulo, String editora, double valor) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.editora = editora;
		this.valor = valor;
	}
	
	public double aplicarDesconto(double taxa) {
		return this.valor*((100-taxa)/100);
	}
	
	public String toString() {
		return "\nLivro\nCodigo = " + codigo + "\nTitulo = " + titulo + "\nEditora = " + editora + "\nValor = "
		+ valor;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
