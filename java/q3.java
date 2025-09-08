import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vitorias = 0;
        for (int i = 0; i < 6; i++) {
            String res = sc.next();
            if (res.equals("V")) vitorias++;
        }
        if (vitorias >= 5) System.out.println(1);
        else if (vitorias >= 3) System.out.println(2);
        else if (vitorias >= 1) System.out.println(3);
        else System.out.println(-1);
    }
}
