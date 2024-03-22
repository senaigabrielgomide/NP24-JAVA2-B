package br.com.senaisp.bauru.luizgabriel.secao05;

import javax.swing.JOptionPane;
import java.util.Random;

public class SorteioDoMilhao {

    public static void main(String[] args) {
        Random rand = new Random();
        int numeroSorteado1, numeroSorteado2, numeroSorteado3, numeroSorteado4;
        double probabilidade = rand.nextDouble(); // Gera um número aleatório entre 0 e 1

        // Se a probabilidade for menor que 0.7, os quatro números serão iguais
        if (probabilidade < 0.7) {
            int numeroIgual = rand.nextInt(8) + 1;
            numeroSorteado1 = numeroIgual;
            numeroSorteado2 = numeroIgual;
            numeroSorteado3 = numeroIgual;
            numeroSorteado4 = numeroIgual;
        } else {
            // Caso contrário, sorteia cada número individualmente
            numeroSorteado1 = rand.nextInt(8) + 1;
            numeroSorteado2 = rand.nextInt(8) + 1;
            numeroSorteado3 = rand.nextInt(8) + 1;
            numeroSorteado4 = rand.nextInt(8) + 1;
        }

        // Exibindo os números sorteados
        JOptionPane.showMessageDialog(null, "Números sorteados: \n" +
                numeroSorteado1 + "\n" +
                numeroSorteado2 + "\n" +
                numeroSorteado3 + "\n" +
                numeroSorteado4);
    }
}
