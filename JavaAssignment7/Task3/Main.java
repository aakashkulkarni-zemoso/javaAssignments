package Assign7.Task3;

public class Main extends Concrete implements NewInterface{

    @Override
    public void int1_meth1() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void int1_meth2() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void int2_meth1() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void int2_meth2() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void int3_meth1() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void int3_meth2() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void newMethod() {
        // TODO Auto-generated method stub
        
    }
    public static void meth1(Interface1 obj){
        System.out.print("Interface1 object");
    }
    public static void meth2(Interface2 obj){
        System.out.print("Interface2 object");
    }
    public static void meth3(Interface3 obj){
        System.out.print("Interface3 object");
    }
    public static void meth4(NewInterface obj){
        System.out.print("NewInterface object");
    }

    public static void main(String[] args){
        Main obj = new Main();
        meth3(obj);
    }
    
}
