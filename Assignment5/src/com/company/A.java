package com.company;

public class A {
    public int a;
    public char b ;

    public void disp(){
        System.out.println("The value of a is " +a);
        System.out.println("the value of b is "+b );
    }

    public void show(){
        //without the initialization of local variable print their value in not possible.
        int c;
        int d;
        System.out.println("The value of c " + c+ " and d are "+d);
    }

}
