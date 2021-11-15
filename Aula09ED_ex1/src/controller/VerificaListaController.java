package controller;

import br.edu.fateczl.lipe.ListaEncadeada.ListaEncadeada;
import br.edu.fateczl.lipe.ListaEncadeada.No;

public class VerificaListaController {

	private ListaEncadeada lista;
	
	public VerificaListaController(ListaEncadeada lista) {
		this.lista = lista;
	}
	
	public boolean verificaOrdemLista() throws Exception {
		try {			
			No atual = lista.pegaNo(0);
			int elementoAtual, proximoElemento;
			while (atual.getProximo() != null) {
				elementoAtual =  Integer.parseInt(atual.getElemento());
				proximoElemento = Integer.parseInt(atual.getProximo().getElemento());
				if (elementoAtual > proximoElemento)
					return false;
				
				atual = atual.getProximo();
			}
			
			return true;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
}
