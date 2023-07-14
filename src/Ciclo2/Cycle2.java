package Ciclo2;

public class Cycle2 {
    public int start;
    public int finish;


    public void ShowCycle () {
        while (start <= finish) {
            System.out.println(start);
            start += 2;
        }
    }
}
