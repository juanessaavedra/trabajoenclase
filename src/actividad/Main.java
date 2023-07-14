package actividad;
public class Main {

    public static void main(String[] args) {


        Division division = new Division();
        System.out.println("El resultado de la division de " + division.number1 + " entre " + division.number2 + " es " + division.div());


        Subtraction subtraction = new Subtraction();
        System.out.println("El resultado de la resta de " + subtraction.number3 + " entre " + subtraction.number4 + " es " + subtraction.sub());

        Multiplication Multiplication = new Multiplication();
        System.out.println("El resultado de la multiplicacion de " + Multiplication.number5 + " entre " + Multiplication.number6 + " es " + Multiplication.multi());

        Person person = new Person();
        System.out.println("Informacion personal: \n Nombre: " + person.name + "\n Apellido: "+ person.apellido + "\n Edad:"+ person.edad +  "\n Cedula:" + person.cedula);


    }
}