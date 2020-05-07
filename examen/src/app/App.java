package app;

import java.util.Scanner;

public class App extends Thread {
    
    Scanner tec = new Scanner(System.in);
    public App(){
        System.out.println(" Ascendentes: ");
    }
    @Override
    public void run(){
        //int asc;
        for (int i = 1; i < 11 ; i++) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        Thread descendentes = new App();
        Thread acendentes = new descen();
        descendentes.start();
        acendentes.start();
    }
}

class descen extends Thread{
    public descen(){
        System.out.println(" Descendentes: ");
    }
    @Override
    public void run(){
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}