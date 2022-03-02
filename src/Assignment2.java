// import statements
import java.util.HashSet;


public class Assignment2 {

    // Main Function
    public static void main(String[] args) {

        // variables
        HashSet<Integer> alphabetSet = new HashSet<Integer>(26);
        int count = 0;

        String string = "abcd efgh ijkl mnop qrst uvwx yz";
        boolean check = false;

        // process
        for (char tempChar : string.toCharArray()) {
            int temp = tempChar - 'a';
            if (temp >= 0 && temp < 26) {
                if (alphabetSet.add(temp)) {
                    count++;

                    if (count == 26) {
                        System.out.println("The String contains all the letters of the Alphabets");
                        check = true;
                        break;
                    }

                }
            }

        }
        if(!check){
            System.out.println("The String doesn't contain all the letters of the Alphabets");
        }

    }

}

// Time complexity: O(n)
// Space Complexity (Bytes) : (String.split * 2) + 2 * 4 (int) + 2 bytes (tempChar)

