package modelo;

public class FactoryNome {
	
	public FactoryNome() {}
	
	public Nome getNome (String nome) {
		
		if(nome.indexOf(",") > 0) {
			return new Nome_invertido(nome, null);
		} else {
			return new Nome_normal(nome, null);
		}
	}

}
