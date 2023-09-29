import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();

        int tot = 0;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= 8; j++)
                tot += (i + 1) * j;

        System.out.println(tot);

        reader.close();
    }
}
