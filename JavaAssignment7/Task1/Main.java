package Assign7.Task1;

public class Main {
    public static void main(String[] args) {
        Rodent arr[] = new Rodent[3];
        arr[0] = new Mouse();
        arr[1] = new Gerbil();
        arr[2] = new Hamster();


        arr[0].eat();
        arr[0].lifespan();

        arr[1].eat();
        arr[1].lifespan();

        arr[2].eat();
        arr[2].lifespan();
    }
}
