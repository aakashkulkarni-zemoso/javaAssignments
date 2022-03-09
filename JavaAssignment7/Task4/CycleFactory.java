package Assign7.Task4;

public class CycleFactory {
    public static Cycle getCycle(String type){
        if(type=="Unicycle"){
            return new Unicycle();
        }
        else if(type=="Bicycle"){
            return new Bicycle();
        }
        else if(type=="Tricycle"){
            return new Tricycle();
        }
        return null;
    }
}
