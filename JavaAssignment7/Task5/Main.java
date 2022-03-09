package Assign7.Task5;

public class Main {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerTwo innerTwo = new OuterClass.InnerTwo("Hello");

    }

}


class OuterClass{

    static class InnerOne{

        InnerOne(String string){
            System.out.println("Inner Class Non Default Constructor: " + string);
        }

    }


    static class InnerTwo extends OuterClass.InnerOne{
        InnerTwo(String string){
            super(string);
        }
    }

}
