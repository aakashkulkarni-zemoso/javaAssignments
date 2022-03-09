package com.company;

public class B {
    static String str;

    B(String otherStr){
        str=otherStr;
    }

    public static B bMethod(String s) {
        //static methods can only access static variables;
        str=s;
        B sc = new B(s);
        return sc;
    }
    public void print() {
        System.out.println(str);
    }

    public static void main(String[] args)
    {
        String str = "ABCD";
        B obj = new B(str);
        obj.bMethod(str);
        obj.print();
    }
}
