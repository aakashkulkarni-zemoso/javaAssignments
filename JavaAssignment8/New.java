package Assign8;

public class New {
    public static void exception(String arg){
        int a= 5;
        int b = 2;
        
        try{
            if(arg.equals("Husain")){
                throw new NameException("Name is Husain");
            }
            System.out.println("Hello "+arg);
            
            if(b==1){throw new DivideByOne();}
            System.out.println(a/b);

        }
        catch(NameException e){
            System.out.println(e.getMessage());
        }
        catch(DivideByOne e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
        }
        finally{
            System.out.println("Finally Block Executes, even if the above ones execute or not");
        }
    }
    public static void main(String[] args){
        exception(null);
    }
}
