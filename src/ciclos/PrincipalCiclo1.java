package ciclos;

public class PrincipalCiclo1 {
    public static void main(String[] args) {
        Ciclo1 ciclo1 = new Ciclo1(); //Lo que es en minuscula es el objeto, mayuscula es la clase
        ciclo1.empieza = 1;
        ciclo1.termina = 10;
        ciclo1.mostrarCiclo();
    }
}
