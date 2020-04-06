package suport;

public class Converte {
	public static String numeroToNewString( int numero, String palavra){
		String gerado = palavra + numero;
		System.out.println("Gerado: " + gerado);
		return gerado;
	}
}
