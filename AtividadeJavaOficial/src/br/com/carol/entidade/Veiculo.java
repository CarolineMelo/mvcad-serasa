package br.com.carol.entidade;


public abstract class Veiculo {
	
	private TipoVeiculo veiculo;
	
	
	public TipoVeiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(TipoVeiculo veiculo) {
		this.veiculo = veiculo;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getAcelera��o() {
		return Acelera��o;
	}
	public void setAcelera��o(int acelera��o) {
		Acelera��o = acelera��o;
	}
	public int getFrenagem() {
		return Frenagem;
	}
	public void setFrenagem(int frenagem) {
		Frenagem = frenagem;
	}
	public int getAutonomia() {
		return Autonomia;
	}
	public void setAutonomia(int autonomia) {
		Autonomia = autonomia;
	}
	public int getVelocidadeMaxima() {
		return VelocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		VelocidadeMaxima = velocidadeMaxima;
	}
	public int getCapacidadeMaximaDeCombust�vel() {
		return CapacidadeMaximaDeCombust�vel;
	}
	public void setCapacidadeMaximaDeCombust�vel(int capacidadeMaximaDeCombust�vel) {
		CapacidadeMaximaDeCombust�vel = capacidadeMaximaDeCombust�vel;
	}
	protected String Modelo;
	protected int Acelera��o;
	protected int Frenagem;
	protected int Autonomia;
	protected int VelocidadeMaxima;
	protected int CapacidadeMaximaDeCombust�vel;
}


