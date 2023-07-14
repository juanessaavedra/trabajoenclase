package switch1;

public class Switch1 {
    public int option;

    public String showOption () { //Los metodos no va con mayuscula
        switch (option) {
            case 1: {
                return "Su premio es una empanada"; //El break es cuando no se tiene un return, porque el return se encarga de hacer break solo
            }
            case 2: {
                return "Su premio es una hamburguesa";
            }
            default: {
                return "opcion incorrecta";
            }
        }
    }
}
