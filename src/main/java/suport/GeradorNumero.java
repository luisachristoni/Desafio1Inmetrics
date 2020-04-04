package suport;

import java.util.Random;

public class GeradorNumero {
	public static int gera100000() {
		// gerar numero
		Random aleatorio = new Random();
		int numero = aleatorio.nextInt(100000);
		System.out.println("Número gerado: " + numero);
		return numero;
	}
	
	public static int geraCombo(){
		Random random = new Random();
		int combo = random.nextInt(2);
		System.out.println("Combo Gerado: " + combo);
		return combo;
	}

}
