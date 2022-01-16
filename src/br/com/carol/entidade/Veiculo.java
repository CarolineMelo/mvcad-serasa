package br.com.carol.entidade;

import br.com.carol.entidade.servico.Calcular;


public class Veiculo extends Calcular{
	 
	protected String tipoVeiculo;
	protected String modelo;
	protected double aceleração;
	protected double frenagem;
	protected double autonomia;
	protected double velocidadeMaxima;
	protected double capacidadeMaximaDeCombustível;
	
	public Veiculo() {
		
	}

	public Veiculo(String tipoVeiculo, String modelo, double aceleração, double frenagem, double autonomia,
			double velocidadeMaxima, double capacidadeMaximaDeCombustível) {
		
		this.tipoVeiculo = tipoVeiculo;
		this.modelo = modelo;
		this.aceleração = aceleração;
		this.frenagem = frenagem;
		this.autonomia = autonomia;
		this.velocidadeMaxima = velocidadeMaxima;
		this.capacidadeMaximaDeCombustível = capacidadeMaximaDeCombustível;
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

	public double getAceleração() {
		return aceleração;
	}

	public void setAceleração(double aceleração) {
		this.aceleração = aceleração;
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

	public double getCapacidadeMaximaDeCombustível() {
		return capacidadeMaximaDeCombustível;
	}

	public void setCapacidadeMaximaDeCombustível(double capacidadeMaximaDeCombustível) {
		this.capacidadeMaximaDeCombustível = capacidadeMaximaDeCombustível;
	}

	@Override
	public String toString() {
		return "Veiculo [tipoVeiculo=" 
		+ tipoVeiculo 
		+ ", modelo=" 
		+ modelo 
		+ ", aceleração=" 
		+ aceleração
					
		+ ", frenagem=" 
		+ frenagem 
		+ ", autonomia=" 
		+ autonomia 
		+ ", velocidadeMaxima=" 
		+ velocidadeMaxima
		+ ", capacidadeMaximaDeCombustível=" 
		+ capacidadeMaximaDeCombustível 
		+ "]";
	}
	
	
	
	
}
	