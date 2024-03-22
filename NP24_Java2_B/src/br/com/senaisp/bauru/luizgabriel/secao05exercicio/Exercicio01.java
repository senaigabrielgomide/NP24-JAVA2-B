package br.com.senaisp.bauru.luizgabriel.secao05exercicio;

public class Exercicio01 {

	public static void main(String[] args) {
		MetodosCalculo mc = new MetodosCalculo();
		double tempC = mc.converterF2C(60.5);
		System.out.println("Temperatura em C é" + tempC);
		double hip = mc.calcularHipotenusa (15,10);
		System.out.println("Hipotenusa é " + hip);
		System.out.println("Valor dos dados foi "+ mc.jogarDados());
		
		
	}

}
