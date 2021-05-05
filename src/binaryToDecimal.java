import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;

public class binaryToDecimal {
    static void checkBinary(String binaryStr) {
        //if not valid, call getBinary again after error message
        try {
            int i = 0; //counter for indexxing the string
            int decimalNumb = 0; //rolling total
            for (int n = (binaryStr.length() - 1); n >= 0; n--){ //n (exponenent) starts high and goes down 
                if (Character.getNumericValue(binaryStr.charAt(i)) > 1) { //check if digit is a 1 or 0
                    throw new Exception(); 
                }
                if (Character.getNumericValue(binaryStr.charAt(i)) == 1) {
                    decimalNumb += Math.pow(2, n);
                }
                i += 1;
            }
            System.out.println("Your decimal number is: " + decimalNumb);
        }
        catch (Exception e){
            System.out.println("Please enter a binary integer containing only 1's and 0's.");
            getBinary();
        }
    }
    
    static void getBinary() {
        Scanner myObj = new Scanner(System.in); //can't close scanner for some reason
        System.out.print("Enter the binary number: ");
        String binaryStr = myObj.nextLine(); 
        System.out.println("You entered " + binaryStr + ".");
        checkBinary(binaryStr); //call method to check validity
        myObj.close();
    }

    public static void main(String[] args) {
        getBinary();
    }
}
