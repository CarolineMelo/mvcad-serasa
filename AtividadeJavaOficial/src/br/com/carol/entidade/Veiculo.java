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
	public int getAceleração() {
		return Aceleração;
	}
	public void setAceleração(int aceleração) {
		Aceleração = aceleração;
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
	public int getCapacidadeMaximaDeCombustível() {
		return CapacidadeMaximaDeCombustível;
	}
	public void setCapacidadeMaximaDeCombustível(int capacidadeMaximaDeCombustível) {
		CapacidadeMaximaDeCombustível = capacidadeMaximaDeCombustível;
	}
	protected String Modelo;
	protected int Aceleração;
	protected int Frenagem;
	protected int Autonomia;
	protected int VelocidadeMaxima;
	protected int CapacidadeMaximaDeCombustível;
}


