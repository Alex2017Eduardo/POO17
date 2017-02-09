import java.util.Scanner;
public class Impar {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        int a = sc.nextInt();
        if(a%2==0){
             System.out.println(" El numero " + a " es  par");
        }else{
            System.out.println(a+" El numero" + a " es impar");
        }      
     }
}