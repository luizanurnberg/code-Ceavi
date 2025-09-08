import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuilder A = new StringBuilder();
        StringBuilder B = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0) A.append(S.charAt(i));
            else B.append(S.charAt(i));
        }
        System.out.println(A.toString());
        System.out.println(B.toString());
    }
}
