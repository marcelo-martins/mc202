package com.marcelo.base;

import java.util.ArrayList;
import com.marcelo.util.*;
import java.util.Collections;


public class BaralhoArrayList {
	private ArrayList<CartaLacaio> vetorCartas;
	
	public BaralhoArrayList(){
		vetorCartas = new ArrayList<CartaLacaio> ();
	}
	
	
	public boolean adicionarCarta(CartaLacaio card){
		if(vetorCartas.size()== Util.MAX_CARDS)
			return false;
		vetorCartas.add(card);
		return true;
	}
	
	public CartaLacaio comprarCarta(CartaLacaio card){
		
		CartaLacaio primeira = vetorCartas.get(vetorCartas.size()-1);
		vetorCartas.remove(vetorCartas.size()-1);
		return primeira;
	}
	
	public void embaralhar(){
		Collections.shuffle(vetorCartas);
		reverso();
		System.out.println(vetorCartas);
		reverso();
	}
	
	public void reverso(){
		Collections.reverse(vetorCartas);
	}
}
