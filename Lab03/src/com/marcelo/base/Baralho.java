package com.marcelo.base;

import java.util.Random;

public class Baralho {
	CartaLacaio[] vetorCartas;
	int nCartas;
	static Random gerador = new Random();
	
	public Baralho(){
		vetorCartas = new CartaLacaio[10];
		nCartas=0;
	}
	
	public boolean adicionarCarta (CartaLacaio card){
		if(nCartas==30)
			return false;
			
		vetorCartas[nCartas]=card;
		nCartas++;
		return true;
	}
	
	public CartaLacaio getVetor(int a){
		return vetorCartas[a];
	}

	public CartaLacaio comprarCarta(){
		nCartas--;
		return vetorCartas[nCartas];
	}
	public void embaralhar(){
		int i,j;

		for(i=1;i<nCartas;i++){
			j=gerador.nextInt(i+1);//Sorteiaumnumerodentre[0,i]
			if(j!=i){
				CartaLacaio a=vetorCartas[i];
				CartaLacaio b=vetorCartas[j];
				vetorCartas[i]=b;
				vetorCartas[j]=a;
			}
		}
		//Comandos para imprimir as cartas em ordem reversa aqui
		for(i=nCartas-1;i>-1;i--){
			System.out.println("Baralho invertido na classe");
			System.out.println(vetorCartas[i]);
		}
	}
	
}
