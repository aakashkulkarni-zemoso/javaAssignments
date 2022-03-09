package Assign7.Task4;

public class Main {
    public static void main(String[] args){
        Cycle c1 = CycleFactory.getCycle("Unicycle");
        c1.cycleType();
        Cycle c2 = CycleFactory.getCycle("Bicycle");
        c2.cycleType();
        Cycle c3 = CycleFactory.getCycle("Tricycle");
        c3.cycleType();
    }
}
