package br.com.senaisp.bauru.luizgabriel.secao07;

public class ContaBancaria {
	
	//Fields estaticos
	public static int ultNumero = 0;
	
	
	//fields
	private int banco;
	private int numeroConta;
	private int agencia;
	private double saldo;
	
	
	//constructor
	public ContaBancaria() {
		banco = 123;
		agencia = 1;
		numeroConta = ++ultNumero;
		saldo = 50;
		
	}
	public ContaBancaria(int ba, int ag, int nc, double sal) {
		setBanco(ba);
		setAgencia(ag);
		setNumeroConta(nc);
		setSaldo(sal);
	}
		
	
	
	//métodos
	public int getBanco() {
		return banco;
	}
	public void setBanco(int banco) {
		this.banco = banco;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
