import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxSeq = 0, atual = 0;
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp > 0) {
                atual++;
                maxSeq = Math.max(maxSeq, atual);
            } else {
                atual = 0;
            }
        }
        System.out.println(maxSeq);
    }
}
