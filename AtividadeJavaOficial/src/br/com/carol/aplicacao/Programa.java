package br.com.carol.aplicacao;

import java.util.HashMap;
import java.util.Map;

public  class Programa{
	

	
	public static void main(String[] args) {
		
		Map<String,String> veiculos = new HashMap<>();
		
		//Automóveis:		
		veiculos.put("1","Ferrari 812");
		veiculos.put("2","Bentley Flying Spur");
		veiculos.put("3","Aston Martin Dbs Superlegera");
		
		//Motos:
		veiculos.put("4","Ducati 1198 S");
		veiculos.put("5","Ducati 620 Sport");
		veiculos.put("6","Indian Chief Dark Horse");
		
		
		//Caminhões:
		veiculos.put("7","Volvo FH 540");
		veiculos.put("8","Scania R450");
		veiculos.put("9","Scania R500");
		
		System.out.println("Sistema montadora de veículos");
		System.out.println("______________________________");
		System.out.println();
		 
		System.out.println("              MENU            ");
		System.out.println("______________________________");
		
		//Veículos a serem construídos e testados:
		System.out.println();
		
		for (String Key : veiculos.keySet()) {
			System.out.println(Key + ":  " + veiculos.get(Key));
		}
		
		System.out.println("______________________________");
		System.out.println();
		System.out.println("Escolha três veículos: ");
		System.out.println();
	
      }
	
}