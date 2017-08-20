import java.util.*;

public class ConsoleIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Create new object. You can use this object to get numbers, letters, and symbols from the console!
        int scannedInteger = sc.nextInt(); //Create an Integer and scan into it the number entered into the console.
        System.out.println("You just scanned the number: "+scannedInteger); //Use the standard out stream to print the number you just scanned out the the console.
        sc.close(); //Close the scanner object - this is simply good practice.
    }
}