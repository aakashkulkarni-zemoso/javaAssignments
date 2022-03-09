package Assign9;
/*String and Type Information
Using the documentation for java.util.regex.Pattern as a resource, write and test a 
regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.*/
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args){
        String regExp;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a statement: ");
        regExp = scn.nextLine();
        
        Pattern pattern = Pattern.compile("^[A-Z].*[.]$");
        Matcher matcher = pattern.matcher(regExp);
        System.out.println(matcher.matches());
          
    }
}
