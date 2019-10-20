package modelo;

public class Nome {
	
	// Atributos
	public String nome;
	public String sobrenome;
	
	// Construtor
	public Nome(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	// GETS E SETS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	// Metodos
	public String criaNome() {
		return "criou nome";
	}
}
