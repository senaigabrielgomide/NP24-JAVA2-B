package br.com.senaisp.bauru.luizgabriel.secao05;

import javax.swing.JOptionPane;

public class ExemplosjOptionPane {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		JOptionPane.showMessageDialog(null,  "Olá " + nome);

	}

}
