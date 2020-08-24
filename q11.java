import java.util.*;

public class q11{
    
    public static void main(String args[]) {
        System.out.println("Enter any number : ");
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        boolean result = specialnumber(inputNumber);
        if (result == true)
            System.out.println(inputNumber + " is a Special number");
        if (result == false)
            System.out.println(inputNumber + " is NOT a Special number");        
    }
    
    public static boolean specialnumber(int inputNumber) { 
 
        int temp = inputNumber;
 
        int sumOfDigits = 0; 
 
 
        while (temp != 0) { 

            int currentDigit = temp % 10;
            sumOfDigits = sumOfDigits + factorial(currentDigit);
            temp = temp/10;
        } 

        return (sumOfDigits == inputNumber);
    }
    
    public static int factorial(int number) {
        if (number == 1 || number == 0)
            return 1;
        else 
            return (number * factorial(number -1));
    }
}