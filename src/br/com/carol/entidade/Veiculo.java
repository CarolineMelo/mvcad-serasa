package br.com.carol.entidade;

import br.com.carol.entidade.servico.Calcular;


public class Veiculo extends Calcular{
	 
	protected String tipoVeiculo;
	protected String modelo;
	protected double acelera��o;
	protected double frenagem;
	protected double autonomia;
	protected double velocidadeMaxima;
	protected double capacidadeMaximaDeCombust�vel;
	
	public Veiculo() {
		
	}

	public Veiculo(String tipoVeiculo, String modelo, double acelera��o, double frenagem, double autonomia,
			double velocidadeMaxima, double capacidadeMaximaDeCombust�vel) {
		
		this.tipoVeiculo = tipoVeiculo;
		this.modelo = modelo;
		this.acelera��o = acelera��o;
		this.frenagem = frenagem;
		this.autonomia = autonomia;
		this.velocidadeMaxima = velocidadeMaxima;
		this.capacidadeMaximaDeCombust�vel = capacidadeMaximaDeCombust�vel;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getAcelera��o() {
		return acelera��o;
	}

	public void setAcelera��o(double acelera��o) {
		this.acelera��o = acelera��o;
	}

	public double getFrenagem() {
		return frenagem;
	}

	public void setFrenagem(double frenagem) {
		this.frenagem = frenagem;
	}

	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getCapacidadeMaximaDeCombust�vel() {
		return capacidadeMaximaDeCombust�vel;
	}

	public void setCapacidadeMaximaDeCombust�vel(double capacidadeMaximaDeCombust�vel) {
		this.capacidadeMaximaDeCombust�vel = capacidadeMaximaDeCombust�vel;
	}

	@Override
	public String toString() {
		return "Veiculo [tipoVeiculo=" 
		+ tipoVeiculo 
		+ ", modelo=" 
		+ modelo 
		+ ", acelera��o=" 
		+ acelera��o
					
		+ ", frenagem=" 
		+ frenagem 
		+ ", autonomia=" 
		+ autonomia 
		+ ", velocidadeMaxima=" 
		+ velocidadeMaxima
		+ ", capacidadeMaximaDeCombust�vel=" 
		+ capacidadeMaximaDeCombust�vel 
		+ "]";
	}
	
	
	
	
}
	