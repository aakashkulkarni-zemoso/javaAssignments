package Assign7.Task1;


public class Gerbil extends Rodent {
    Gerbil(){
        System.out.println("Gerbil CLass");
    }

    @Override
    public void eat() {
        System.out.println("Gerbils eat dried banana, pumpkin seeds and insects");
        
    }

    @Override
    public void lifespan() {
        System.out.println("Gerbils have a lifespan of 2-4 yrs.");
        
    }
    
}
