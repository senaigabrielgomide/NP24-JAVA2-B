package br.com.senaisp.bauru.luizgabriel.secao07;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println(ContaBancaria.ultNumero);
        ContaBancaria c1 = new ContaBancaria();
        System.out.println("Nr. conta: " + c1.getNumeroConta());
        ContaBancaria c4 = new ContaBancaria();
        System.out.println("Nr. conta: " + c4.getNumeroConta());
        
        //c1.setAgencia(1900);
        //c1.setBanco(341);
        c1.setNumeroConta(12345);
        //c1.setSaldo(-10);
        ContaBancaria c2 = c1;
        System.out.println(c1.getSaldo());
        c2.setSaldo(50);
        System.out.println(c1.getSaldo());
        adicionarValor(c1,100.00);
        System.out.println(c1.getSaldo());
        //conta passando valores no constructor
        ContaBancaria c3 = new ContaBancaria (123, 2,1478, 65);
        System.out.println(c3.getSaldo());
    }

    private static void adicionarValor(ContaBancaria conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
    }
}
