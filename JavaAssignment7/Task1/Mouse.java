package Assign7.Task1;

public class Mouse extends Rodent {
    Mouse(){
        System.out.println("Mouse CLass");
    }

    @Override
    public void eat() {
        System.out.println("Mice eat grains, seeds and fruits");
        
    }

    @Override
    public void lifespan() {
        System.out.println("Mice have a lifespan of 12-18 months.");
        
    }
    
}
