package maquina;

import java.util.Scanner;

public class MainDispenser {
    public static void main(String[] args) {
        Dispenser dispenser = new Dispenser();
        Scanner lector = new Scanner(System.in);
        dispenser.candyPrice = 500;
        System.out.println("¿Quiere un dulce? \n 1: Si \n 2: No");
        dispenser.option = lector.next();
        System.out.println("Ingrese el dinero del dulce");
        dispenser.cash = lector.nextInt();



        System.out.println(dispenser.showOption());
    }
}
