package visao;

import modelo.FactoryNome;
import modelo.Nome;

public class Cliente {

	public static void main(String[] args) {
		
        FactoryNome fabrica = new FactoryNome();
		
        Nome n1 = fabrica.getNome("McNealy, Scott");
		System.out.println(n1.criaNome());
		
		Nome n2 = fabrica.getNome("James Gosling");
		System.out.println(n2.criaNome());
		
		Nome n3 = fabrica.getNome("Naughton, Patrick");
		System.out.println(n3.criaNome());
		
	}

}
