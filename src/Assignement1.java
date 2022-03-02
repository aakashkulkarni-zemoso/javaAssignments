// Question
//Create a java program to search through the home directory and look for files that match a regular expression
// The program should be able to take inputs repeatedly and should print out the full absolute path of the matching
// files found.


// Import Statements
import java.util.Objects;
import java.util.Scanner;
import java.io.File;

// Class
public class Assignement1 {


    // Main Function
    public static void main(String[] args){

        File folder = new File("/Users/aakashkulkarni/Desktop");

        String[] listOfFolders = folder.list();
        Scanner scanner = new Scanner(System.in);
        String input;


        for(String string: listOfFolders){
            System.out.println(string);
        }

        System.out.print("\nEnter the file name or the folder name: ");
        input = scanner.nextLine();


        while(input != "1"){
            boolean check = false;
            for (String listOfFolder : listOfFolders) {
                if (Objects.equals(input, listOfFolder)) {
                    check = true;
                    System.out.println("The File is found");
                    System.out.println("Name of the File: " + input);
                    System.out.println("Path of the file: " + folder.getAbsolutePath());
                }
                
            }
            if(!check){
                System.out.println("File Not Found");
            }
            System.out.print("\nEnter the file name or the folder name: ");
            input = scanner.nextLine();


        }


    }

}
