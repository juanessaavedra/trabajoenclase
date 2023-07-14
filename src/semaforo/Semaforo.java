package semaforo;

public class Semaforo {

    public String color;
    public Boolean estado;

    public String mostrarEstado() {
        if (estado) {
            return "Semaforo encendido";
        } else {
            return "Semaforo apagado";
        }
    }

        public String mostrarMensaje() {
            if (color.equals("Verde")) { //Para comprarar no se usa == sino .equals
                return "siga";
            } else if (color.equals("Rojo")) {
                return "pare";
            } else if (color.equals ("Amarillo")) {
                return "Amarillo";
            } else {
                return "color no disponible";
            }
        }




}
