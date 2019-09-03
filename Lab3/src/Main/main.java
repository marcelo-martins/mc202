package Main;


import com.marcelo.base.*;
import com.marcelo.util.*;

public class main {

	public static void main(String[] args) {
		
		CartaLacaio lac1 = new CartaLacaio(1, "Jorge", 72, 68, 42);
		CartaLacaio lac2 = new CartaLacaio(2, "cebola", 4 , 5, 6);
		CartaLacaio lac3 = new CartaLacaio(3, "suki", 56, 98, 25);
		
		Baralho copas = new Baralho();
		BaralhoArrayList kings = new BaralhoArrayList();
		
		//copas.adicionarCarta(lac1);
		//copas.adicionarCarta(lac2);
		//copas.adicionarCarta(lac3);
		
		//copas.embaralhar();
		
		System.out.println("Baralho embaralhado:");
		System.out.println(copas.getVetor(0));
		System.out.println(copas.getVetor(1));
		System.out.println(copas.getVetor(2));
		
		kings.adicionarCarta(lac1);
		kings.adicionarCarta(lac2);
		kings.adicionarCarta(lac3);
		
		kings.embaralhar();
		
		//Teste 1
		/*for(int i=0;i<10;i++){
			copas.adicionarCarta(lac1);
		}*/
		
		
		//Teste 2
		copas.comprarCarta();
	}

}
