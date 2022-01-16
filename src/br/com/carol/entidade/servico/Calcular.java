package br.com.carol.entidade.servico;

public abstract class Calcular {
	
	public double velocidade(double quantidadeDeAceleracao, double automia) {
		return quantidadeDeAceleracao * automia;
	
			
	}
	public double frear(double quantidadeKm, double frenagem) {
		return quantidadeKm / frenagem;
		
	}
	public double consumoDeCombustivel(double distancia, double autonomia) {
		return Math.pow(distancia,autonomia);
		
	}
	
	public double DistanciaRestante(double distanciaPercorrida, double quatidadeCombustivel) {
		return distanciaPercorrida /quatidadeCombustivel;
	
}
	public String toString() {
		
		return null;
	}

}


//Frear - Quantidade de km/h  / Frenagem ex:10
//Consumo de combustivel - Distancia ** autonomia
//Distancia restante - Distancia(scanner - usuário) / qnt de combustivel
