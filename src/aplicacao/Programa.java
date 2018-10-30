package aplicacao;

import entities.Cliente;

public class Programa {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Maria", "maria@email.com");
		Cliente c2 = new Cliente("Maria", "maria2@email.com");
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		String s1Obj = new String("Teste");
		String s2Obj = new String("Teste");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		//Como o == compara a referência do Objeto o resultado será false
		System.out.println(c1 == c2);
		
		//Por ser literal recebe um tratamento diferente e o resultado é true
		System.out.println(s1 == s2);
		
		//Por ser novas referências de obj o resultado é false
		System.out.println(s1Obj == s2Obj);
		
	}

}
