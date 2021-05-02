import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;
import java.math.BigInteger;

public class binaryToDecimal {
    static void convertNumb(List<Integer> digitArr){
        System.out.println("test print");
        int decimalNumb = 0;
        for (int i = 0; i < digitArr.size(); i++){
            if(digitArr.get(i) == 1){
                decimalNumb += Math.pow(2, i);
            }
        }
        System.out.println("Decimal number: " + decimalNumb);
    }

    static void reverseNumb(int binaryNumb){
        int reversedNumb = 0;
        List<Integer> digitArr = new ArrayList<Integer>();
        while(binaryNumb != 0){
            int digit = binaryNumb % 10;
            digitArr.add(digit);
            reversedNumb = reversedNumb * 10 + digit;
            binaryNumb /= 10;
        }
        System.out.println("Reversed Number: " + reversedNumb); //test if reversed number is right
        System.out.println("Reversed ArrayList: " + digitArr);
        convertNumb(digitArr);
    }
    //gonna split into list, reverse the list, then if 1 add decimal value associated.

    static void checkBinary(String binaryStr) {
        //if not valid, call getBinary again after error message
        try {
            int binaryNumb = Integer.parseInt(binaryStr);
            while (binaryNumb != 0){
                if ((BigInteger binaryNumb) % 10 > 1) { //check if last digit is a 1 or 0
                    throw new Exception(); //need to fix so works for big numbers
                }
                binaryNumb = binaryNumb / 10; //remove last digit
            }
            System.out.println("Your binary number is valid.");
            reverseNumb(Integer.parseInt(binaryStr)); //because the int became 0
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
    }

    public static void main(String[] args) {
        getBinary();
    }
}
