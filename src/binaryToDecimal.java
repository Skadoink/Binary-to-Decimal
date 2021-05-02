import java.util.Scanner;  // Import the Scanner class

public class binaryToDecimal {
    static void checkBinary(String binaryStr) {
        //if not valid, call getBinary again after error message
        try {
            int binaryNumb = Integer.parseInt(binaryStr);
            while (binaryNumb != 0){
                if (binaryNumb % 10 > 1) { //check if last digit is a 1 or 0
                    throw new Exception();
                }
                binaryNumb = binaryNumb / 10; //remove last digit
            }
            System.out.println("Your binary number is valid.");
        }
        catch (Exception e){
            System.out.println("Please enter a binary integer containing only 1's and 0's.");
            getBinary();
        }
    }
    static void getBinary() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String binaryStr = myObj.nextLine(); 
        System.out.println("You entered " + binaryStr + ".");
        checkBinary(binaryStr); //call method to check validity
    }

    public static void main(String[] args) {
        getBinary();

    }
}
