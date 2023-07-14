package semaforo;

public class MainSemaforo {
    public static void main (String [] args) {

        Semaforo semaforo = new Semaforo () ;
        semaforo.color = "Rojo";
        semaforo.estado = true;

        if (semaforo.estado) {
            System.out.println(semaforo.mostrarMensaje());
        }
    }
}