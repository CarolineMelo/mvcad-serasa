package br.com.carol.aplicacao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.carol.entidade.Moto;

public  class Programa{
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Moto moto = new Moto();
		moto.consumoDeCombustivel(0, 0);
		
		
		Map<Integer,String> veiculos = new HashMap<>();
		
		//Automóveis:		
		veiculos.put(1,"Ferrari 812");
		veiculos.put(2,"Bentley Flying Spur");
		veiculos.put(3,"Aston Martin Dbs Superlegera");
		
		//Motos:
		veiculos.put(4,"Ducati 1198 S");
		veiculos.put(5,"Ducati 620 Sport");
		veiculos.put(6,"Indian Chief Dark Horse");
		
		
		//Caminhões:
		veiculos.put(7,"Volvo FH 540");
		veiculos.put(8,"Scania R450");
		veiculos.put(9,"Scania R500");
		
		System.out.println("Sistema montadora de veículos");
		System.out.println("______________________________");
		System.out.println();
		 
		System.out.println("              MENU            ");
		System.out.println("______________________________");
		
		//Veículos a serem construídos e testados:
		System.out.println();
		
		for (Integer Key : veiculos.keySet()) {
			System.out.println(Key + ":  " + veiculos.get(Key));
		}
		
		System.out.println("______________________________");
		System.out.println();
		System.out.println("Faça sua escolha/ três veículos: ");
		int escolha = sc.nextInt();
		
		System.out.println();
		System.out.println("Deseja iniciar o teste ? Opções S(Sim) ou N(Não) ");
		char opcao = sc.next().charAt(0);
			
		sc.close();
	
      }
	
}