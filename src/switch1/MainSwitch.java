package switch1;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Switch1 s = new Switch1();
        Switch1 switch2 = new Switch1();
        Scanner lector = new Scanner(System.in); //Clase scanner que ya viene en Java por defecto, nos sirve para escribir por consola
        //¿Que es setear? darle un valor a la propiedad

        System.out.println("Ingrese una opcion:");
        s.option = lector.nextInt();  //nextInt es un metodo que esta en Java y lo usamos porque el valor que va entrar es entero
//Si es un String, no se pone nextInt, sino solamente next

        System.out.println(s.showOption());
    }
}
