import java.util.Scanner;
public class Mes {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero del mes");        
        int mes = sc.nextInt();        
        if(mes == 1)                   
            System.out.println("El mes es ENERO " );
        else if(mes == 2)
            System.out.println("El mes es FEBRERO");
        else if(mes == 3)
            System.out.println("El mes es MARZO");
        else if(mes == 4)
            System.out.println("El mes es ABRIL");
        else if(mes == 5)
            System.out.println("El mes es MAYO");
        else if(mes == 6)
            System.out.println("El mes es JUNIO");
        else if(mes == 7)
            System.out.println("El mes es JULIO");
        else if(mes == 8)
            System.out.println("El mes es AGOSTO");
        else if(mes == 9)
            System.out.println("El mes es SEPTIEMBRE");
        else if(mes == 10)
            System.out.println("El mes es OCTUBRE");
        else if(mes == 11)
            System.out.println("El mes es NOVIEMBRE");
        else if(mes == 12)
            System.out.println("El mes es DICIEMBRE");
        else if (mes > 12)
            System.out.println("NUMERO INVALIDO");
    }
}