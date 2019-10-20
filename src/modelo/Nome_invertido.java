package modelo;

public class Nome_invertido extends Nome{
	
	private String divide_nome[] = new String[1];

	public Nome_invertido(String nome, String sobrenome) { // Separa o nome na virgula criando nome e sobrenome
		super(nome, sobrenome);
		divide_nome =  nome.split(", ");
		this.nome = divide_nome[1];
		this.sobrenome = divide_nome[0];
	}

	public String criaNome() { // Cria o nome 
		return divide_nome[1] + " " + divide_nome[0];
	}

}
