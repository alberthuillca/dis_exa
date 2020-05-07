import java.util.Scanner;

public class ejer2{
    
    public static void main( String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un Numero : ");
        int num = numero.nextInt();
        int fac = 1;
        while (num != 0 ) {
            fac *= num;
            num--;
        }
        System.out.println("El factorial es "+  fac);
    }

    
}