package Assign7.Task2;
/*Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. 
Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle. 
Create instances of all three types and upcast them to an array of Cycle. 
Try to call balance( ) on each element of the array and observe the results. Downcast and call balance( ) 
and observe what happens.*/
public class Cycle{
    int wheels;
    Cycle(){
        this.wheels=0;
    }
    Cycle(int wheels){
        this.wheels = wheels;
        System.out.println("This cycle has "+wheels+" wheels.");
    }
}
