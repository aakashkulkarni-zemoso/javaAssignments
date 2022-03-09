package Assign7.Task1;

public class Hamster extends Rodent{
    Hamster(){
        System.out.println("Hamster Class.");
    }

    @Override
    public void eat() {
        System.out.println("Hamsters eat plants and insects.");
        
    }

    @Override
    public void lifespan() {
        System.out.println("Hamsters have a lifespan of 2-3 yrs.");
        
    }
    
}
