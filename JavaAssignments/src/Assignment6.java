import java.lang.*;
import java.io.*;
import java.util.*;


// =============================================
// part 1
// =============================================
//public class Assignment6 {
//    public static void main(String args[]) {
//        int count = 100;
//        int c = 0;
//        int i = 10;
//        while(count>c)
//        {
//            //  System.out.println(i);
//            String s=String.valueOf(i);
//            int len = s.length();
//            if(len%2==0)
//            {
//                int k = (int)Math.pow(10,len/2);
//                int a = i/k;
//                int reverse=0;
//                while(a != 0)
//                {
//                    int remainder = a % 10;
//                    reverse = reverse * 10 + remainder;
//                    a = a/10;
//                }
//                a= reverse;
//                int b = i%k;
//                if(a*b == i)
//                {
//                    System.out.println(i);
//                    c++;
//                }
//            }
//            i++;
//        }
//    }
//}

// =============================================
// =============================================



// =============================================
// part 2
// =============================================

//public class Assignment6 {
//
//    Assignment6(){
//        //this keyword is used to call some other constructor of same class.
//        this("Random");
//    }
//
//    Assignment6(String name){
//        System.out.println("Overloaded Constructor. Hello "+name);
//    }
//
//    public static void main(String[] args){
//        Assignment6 obj = new Assignment6();
//    }
//}





// =============================================
// =============================================





// =============================================
// part3
// =============================================



public class Assignment6 {

    Assignment6(String arg){
        System.out.println(arg);
    }

    public static void main(String[] args) {
        Assignment6 assignment = new Assignment6("Object is created");
        Assignment6 arr[] = new Assignment6[3];
//        for(Assignment6 assignment6 : arr){
//            System.out.println(assignment6);
//        }
    }
    // No when the object array is created, the constructor is not called.
}






// =============================================
// =============================================