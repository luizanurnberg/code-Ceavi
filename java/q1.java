import java.util.*;

public class Q1 {
    private static String toBase(long n, int b) {
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(digits.charAt((int)(n % b)));
            n /= b;
        }
        return sb.length() == 0 ? "0" : sb.reverse().toString();
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        List<Integer> bases = new ArrayList<>();

        for (int b = 2; b <= N; b++) {
            String rep = toBase(N, b);
            if (isPalindrome(rep)) {
                bases.add(b);
            }
        }

        if (bases.isEmpty()) {
            System.out.println("*");
        } else {
            for (int i = 0; i < bases.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(bases.get(i));
            }
            System.out.println();
        }
        sc.close();
    }
}
