import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) pares++;
        }
        System.out.println(pares);
    }
}
