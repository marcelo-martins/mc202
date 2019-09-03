package lab01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartaLacaio lac1=new CartaLacaio(1,"FrodoBolseiro",2,1,1);
		CartaLacaio lac2=new CartaLacaio(2,"Aragorn",5,7,6);
		CartaLacaio lac3=new CartaLacaio(3,"Legolas",8,4,6);
		CartaMagia mag1=new CartaMagia(4,"Youshallnotpass",4,true,7);
		CartaMagia mag2=new CartaMagia(5,"Telecinese",3,false,2);
		//impressaodosobjetos
		System.out.println("Primeirolacaio:\n"+lac1);
		System.out.println("Segundolacaio:\n"+lac2);
		System.out.println("Terceirolacaio:\n"+lac3);
		System.out.println("Primeiramagia:\n"+mag1);
		System.out.println("Segundamagia:\n"+mag2);

	}

}
