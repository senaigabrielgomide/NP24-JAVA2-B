package br.com.senaisp.bauru.luizgabriel.secao05exercicio;

public class ProcessadorNome {
	

	public String processarNome (String nome) {
		// pegando sobrenome
		String sbnom = nome.substring(nome.lastIndexOf(' ')+1);
		String iniNom = ""+nome.charAt(0)+".";
		return sbnom + ", " + iniNom;
	}

}
