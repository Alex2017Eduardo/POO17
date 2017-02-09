import java.util.Scanner;
public class Dias_Mes {

	public static void main ( String [] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" ");  
        System.out.println(" NOMBRE DEL MES (con minusculas)"); 
        System.out.println(" ");        
        String mes;
        mes = sc.nextLine();        
        switch(mes){
        	case "enero":
        	case "marzo":
        	case "mayo":
        	case "julio":
        	case "agosto":
        	case "octubre":
        	case "diciembre":
        	System.out.println(" "); 
        	System.out.println(" 31 dias");
        	break;

        	case "abril":
        	case "junio":
        	case "septiembre":
        	case "noviembre":
        	System.out.println(" ");
        	System.out.println(" 30 dias");        	 
        	break;

        	case "febrero":
        	System.out.println(" ");
        	System.out.println(" 29 dias");
        	break;

        	default:
        	System.out.println(" "); 
        	System.out.println(" NOMBRE INVALIDO");
        	} 
	}
}