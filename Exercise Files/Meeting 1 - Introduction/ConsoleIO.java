import java.util.*; //You must add this to your code for Java to know where to access the input Scanner.

public class ConsoleIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Create new Scanner object. You can use this Scanner to get numbers, letters, and symbols from the console!
        int scannedInteger = sc.nextInt(); //Create an Integer and scan into it the number entered into the console.
        System.out.println("You just scanned the number: "+scannedInteger); //Use the standard out stream to print the number you just scanned out the the console.
        sc.close(); //Close the scanner object - this is simply good practice to avoid memory leakage.
    }
}