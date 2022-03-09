package Assign8;

public class DivideByOne extends Exception {
    DivideByOne(){
        System.out.println("/ by 1");
    }
    DivideByOne(String msg){
        super(msg);
    }
}
