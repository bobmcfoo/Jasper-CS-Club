import java.util.*;

public class ChallengeSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Create new Scanner object to get numbers in
        int A = sc.nextInt(); //Get A
        int B = sc.nextInt(); //Get B
        double solution = Math.log10((8 * Math.pow(A, 3)) / (B - 23) * Math.PI); //Calculate answer and insert into double variable
        System.out.println(solution); //Print solution
        sc.close(); //Close Scanner
    }
}