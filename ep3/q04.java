import java.util.Scanner;

public class q04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++)
                System.out.print("-");

            for(int j = 1; j <= i * 2 - 1; j++)
                System.out.print("1");

            for(int j = 1; j <= n - i; j++)
                System.out.print("-");

            System.out.println();
        }

        reader.close();
    }
}
