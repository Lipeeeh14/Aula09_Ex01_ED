package view;

import br.edu.fateczl.lipe.ListaEncadeada.ListaEncadeada;
import br.edu.fateczl.lipe.ListaEncadeada.No;
import controller.VerificaListaController;

public class Principal {

	public static void main(String[] args) {
		No e3 = new No("3", null);
		No e2 = new No("4", e3);
		No e1 = new No("2", e2);
		
		ListaEncadeada lista = new ListaEncadeada();
		lista.adicionaElemento(e1);
		lista.adicionaElemento(e2);
		lista.adicionaElemento(e3);
		
		VerificaListaController v = new VerificaListaController(lista);
		try {
			boolean resultado = v.verificaOrdemLista();
			if (resultado)
				System.out.println("A lista está ordenada");
			else
				System.out.println("A lista não está ordenada");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
