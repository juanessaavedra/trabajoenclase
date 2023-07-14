package dowhile;

public class Ciclo3 {
    public int empieza;
    public int termina;

    public void mostrarCiclo () {
        do{
            System.out.println(empieza);
            empieza++;
        } while (empieza <= termina);
    }
}
