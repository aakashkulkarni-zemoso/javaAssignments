package Assign7.Task2;

public class Main {
    public static void main(String[] args){
        Cycle arr[] = new Cycle[3];
        //Upcasting
        arr[0]=new Unicycle();
        arr[1]=new Bicycle();
        arr[2]=new Tricycle();

        /* arr[0].balance();
           arr[1].balance();
           Throws error if we upcast Unicycle and Bicycle into Cycle 
           cause the parent class has no idea about the balance methods defined in child classes.
           The created instances can only access what is available in reference type of object and not type of obj.*/
        
        //Downcasting

        Unicycle obj = new Unicycle();
        obj.balance();
        Bicycle obj2 = new Bicycle();
        obj2.balance();
    }
}
