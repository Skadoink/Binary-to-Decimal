import java.util.Scanner;  // Import the Scanner class

public class binaryToDecimal {
    static void checkBinary(int binaryNumb) {
        //if not valid, call getBinary again after error message
    }
    static void getBinary() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the binary number: ");

        int binaryNumb = myObj.nextInt(); //needs to make sure int is used
        //could just use string and check conversion to int in checkBinary method
        System.out.println("Your binary number is " + binaryNumb + ".");
        myObj.close();
        checkBinary(binaryNumb); //call method to check validity
    }

    public static void main(String[] args) {
        getBinary();

    }
}
