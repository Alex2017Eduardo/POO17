public class locales {
		//El nombre de la clase se pone con mayuscula
	public static void main ( String [] args)  {// Espacios 
			byte alfa = -128; // se dejan espacios
			short b = -32768; 	//En el identificador de variable va seguidop de un nombre
			int c = -2147483648;
			long d = -9223372036854775807L;
			char e = 'A';
			String f = null;
			String g = " Hola Java ";

													// No se usan los paremtesis como los habia puesto
			System.out.println("El valor de byte  es de : " + a + " hasta 127" );
			System.out.println("El valor de short es de : " + b + " hasta 32767" );
			System.out.println("El valor de int   es de : " + c + " hasta 2147483647" );
			System.out.println("El valor de long  es de : " + d + " hasta 9223372036854775807L" );
			System.out.println("El valor de char  es de : " + e+ " Solo es un caracter" );
			System.out.println("String se inicializa con valor : " + f  );
			System.out.println("String se inicializo con : "+g+" esto es una cadena de caracteres" );
	}
}