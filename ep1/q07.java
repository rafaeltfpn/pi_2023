import java.util.Scanner;

public class q07 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();

        int dig1 = a / 1000;
        int dig2 = a / 100 % 10;
        int dig3 = a / 10 % 10;
        int dig4 = a % 10;

        System.out.printf("%d%d%d%d", (dig1 + 1) % 10, (dig2 + 1) % 10, (dig3 + 1) % 10, (dig4 + 1) % 10);

        reader.close();
    }
}
