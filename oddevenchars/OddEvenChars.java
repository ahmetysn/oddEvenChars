package oddevenchars;
import java.util.*;

public class OddEvenChars {

    public static void main(String[] args) {
        String myString = "This is String example.";
        char[] myCharArray = myString.toCharArray();
        
        for(int i = 0; i < myString.length(); i++){        
            System.out.print(myCharArray[i] + " "); 
        }
      
      Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();   // taking number of test cases from user
        for(int i = 0; i < testCases; i++){
            char[] inputString = scan.next().toCharArray();  // taking string to test from user
			
            // Print even chars
            for(int j = 0; j < inputString.length; j += 2){
                System.out.print(inputString[j]);
            }
            System.out.print(" ");
            
            // Print odd chars
            for(int j = 1; j < inputString.length; j += 2){
                System.out.print(inputString[j]);
            }
            System.out.println();
        }
        scan.close();

    }
    
}
