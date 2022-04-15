package br.com.factorymethod.maladireta.csv;

import br.com.factorymethod.contato.Contatos;
import br.com.factorymethod.maladireta.MalaDireta;

public class MalaDiretaCSV extends MalaDireta {

	private String nomeArquivo;

	public MalaDiretaCSV(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	protected Contatos criarContatos() {
		return new ContatosCSV(nomeArquivo);
	}

}
