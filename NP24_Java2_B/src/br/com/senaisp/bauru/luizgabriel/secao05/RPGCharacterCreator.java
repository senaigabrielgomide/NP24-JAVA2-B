package br.com.senaisp.bauru.luizgabriel.secao05;

import javax.swing.JOptionPane;

public class RPGCharacterCreator {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Qual é o nome do seu personagem?");
        String race = JOptionPane.showInputDialog("Qual é a raça do seu personagem?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos tem seu personagem?"));
        String classType = JOptionPane.showInputDialog("Qual é a classe do seu personagem?");
        int strength = Integer.parseInt(JOptionPane.showInputDialog("Digite a força do seu personagem (de 1 a 10):"));
        int intelligence = Integer.parseInt(JOptionPane.showInputDialog("Digite a inteligência do seu personagem (de 1 a 10):"));
        double health = Double.parseDouble(JOptionPane.showInputDialog("Digite a saúde inicial do seu personagem:"));
        
        // Calculando a pontuação total do personagem
        int totalScore = strength + intelligence;

        // Exibindo a história do personagem com base nas entradas do usuário
        String story = "Descrição do personagem:\n\n";
        story += "Meu nome é " + name + ", sou da raça " + race + ", tenho " + age + " anos.\n";
        story += "Minha classe é " + classType + ".\n";
        story += "Força: " + strength + ", Inteligência: " + intelligence + ".\n";
        story += "Saúde: " + health + "%.\n";
        story += "Meu poder total é " + totalScore + ".\n\n";
        story += "Espero poder entrar na sua guilda.";

        // Exibindo a história do personagem
        JOptionPane.showMessageDialog(null, story);
    }
}