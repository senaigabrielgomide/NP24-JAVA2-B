package br.com.senaisp.bauru.luizgabriel.secao05exercicio;

import java.util.Random;

public class MetodosCalculo {
    /**
     * Método que calcula a temperatura Celsius a partir de uma
     * temperatura em Fahrenheit.
     * @param temp temperatura em Fahrenheit
     * @return temperatura em Celsius
     */
    public double converterF2C(double temp) {
        return (temp - 32) * 5 / 9;
    }
    
    /**
     * Método que calcula a hipotenusa de um triângulo retângulo
     * utilizando os catetos.
     * @param co comprimento do cateto oposto
     * @param ca comprimento do cateto adjacente
     * @return comprimento da hipotenusa
     */
    public double calcularHipotenusa(double co, double ca) {
        return Math.sqrt(Math.pow(co, 2) + Math.pow(ca, 2));
    }
    
    public int jogarDados() {
		
    	Random rnd = new Random();
    	return rnd.nextInt(6)+1+rnd.nextInt(6)+1;
    }
    
    
    
    
}