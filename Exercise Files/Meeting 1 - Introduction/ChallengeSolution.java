import java.util.*;

public class ChallengeSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double solution = Math.log10((8 * Math.pow(A, 3))/(B - 23) * Math.PI);
        System.out.println(solution);
    }
}
