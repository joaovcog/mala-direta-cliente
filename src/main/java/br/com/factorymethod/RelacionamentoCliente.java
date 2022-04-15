package br.com.factorymethod;

import javax.swing.JOptionPane;

import br.com.factorymethod.maladireta.MalaDireta;
import br.com.factorymethod.maladireta.xml.MalaDiretaXML;

public class RelacionamentoCliente {
	
	public static void main(String[] args) {
		MalaDireta malaDireta = new MalaDiretaXML("contatos.xml");
		String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");
		
		boolean status = malaDireta.enviarEmail(mensagem);
		
		JOptionPane.showMessageDialog(null, "E-mails enviados: " + status);
	}
	
}
