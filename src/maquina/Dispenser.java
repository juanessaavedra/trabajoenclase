package maquina;

public class Dispenser {
    public String option;
    public String candy1;


    public int cash;

    public int candyPrice;


    public String showOption() { // 1: Si 2: No
        switch (option) {
            case "1": {
                System.out.println(cash);
                if (cash >= candyPrice) {
                   return "Puede tomar el dulce y su devuelta es:" + (cash-candyPrice);
                } else {
                    return "Dinero insuficiente";
                }

            }
            case "2": {
                return "Chao";
            }
            default: {
                return "Opcion incorrecta";
            }
        }
    }


}
