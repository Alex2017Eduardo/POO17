public class locales{

	public static void main (String[]args){
	byte a = -128;
	short b = -32768;
	int c = -2147483648;
	long d = -9223372036854775807L;
	char e = 'A';
	String f = null;
	String g = " Hola Java ";


	System.out.println("El valor de byte  es de : " + (a) + " hasta 127" );
	System.out.println("El valor de short es de : " + (b) + " hasta 32767" );
	System.out.println("El valor de int   es de : " + (c) + " hasta 2147483647" );
	System.out.println("El valor de long  es de : " + (d) + " hasta 9223372036854775807L" );
	System.out.println("El valor de char  es de : " + (e)+ " Solo es un caracter" );
	System.out.println("String se inicializa con valor : " + (f)  );
	System.out.println("String se inicializo con : "+(g)+" y es una cadena de caracteres" );
	}
}