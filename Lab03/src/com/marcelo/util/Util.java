package com.marcelo.util;

import com.marcelo.base.CartaLacaio;

public class Util {
	
	
	
	public static void buffar(CartaLacaio lac,int a){
		lac.setVidaAtual(lac.getVidaAtual()+a);
		lac.setVidaMaxima(lac.getVidaMaxima()+a);
		lac.setAtaque(lac.getAtaque()+a);
	}
	public static void buffar(CartaLacaio lac,int a,int v){
		lac.setVidaAtual(lac.getVidaAtual()+v);
		lac.setVidaMaxima(lac.getVidaMaxima()+v);
		lac.setAtaque(lac.getAtaque()+a);
	}
	private static void alteraNomeFortalecido(CartaLacaio lac){
		lac.setNome(lac.getNome()+ " Buffed");
	}
	public static final int MAX_CARDS = 30;
}
