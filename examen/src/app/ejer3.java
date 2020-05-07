package app;

import java.util.Scanner;

public class ejer3 extends Thread{
    Scanner datos = new Scanner(System.in);
    String leopardo;
    public ejer3(){
        
        System.out.println("ingresar Nombre de leopardo : ");
        leopardo= datos.nextLine();
    }
    @Override
    public void run(){
        for (int i = 1; i <= 50; i++) {
            System.out.println(i+" metros"+" "+leopardo);
        }
        System.out.println("llego "+leopardo);
    }
    public static void main(String[] args) {
        Thread primero = new ejer3();
        Thread Segundo = new ejer3();
        Thread Tercero = new ejer3();
        Thread cuarto = new ejer3();
        primero.start();
        Segundo.start();
        Tercero.start();
        cuarto.start();
    }
}