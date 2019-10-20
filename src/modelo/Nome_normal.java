package modelo;

public class Nome_normal extends Nome{

	private String divide_nome[] = new String[1];
	
	public Nome_normal(String nome, String sobrenome) { // Separa o nome no espaco criando um array com nome no campo O e sobrenome no campo 1
		super(nome, sobrenome);
		divide_nome =  nome.split(" ");
		this.nome = divide_nome[0];
		this.sobrenome = divide_nome[1];
	}
	
	public String criaNome() { // Cria o nome apartir da divisao do nome
		return divide_nome[0] + " " + divide_nome[1];
	}

}
