package br.com.factorymethod.maladireta.xml;

import br.com.factorymethod.contato.Contatos;
import br.com.factorymethod.maladireta.MalaDireta;

public class MalaDiretaXML extends MalaDireta {

	private String nomeArquivo;

	public MalaDiretaXML(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	@Override
	protected Contatos criarContatos() {
		return new ContatosXML(nomeArquivo);
	}

}
