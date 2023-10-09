import java.util.Scanner;

public class q06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(), i, t = 0;

        for (i = 1; i <= n; i++)
            System.out.printf("%d ", t += 3);

        s.close();
    }
}
