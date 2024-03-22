package br.com.senaisp.bauru.luizgabriel.secao05exercicio;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome completo:");
        ProcessadorNome pn = new ProcessadorNome();
        String nomeProcessado = pn.processarNome(nome);
        JOptionPane.showMessageDialog(null, nomeProcessado);
    }
}
