import java.util.Scanner;

public class q03 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();
        int b = reader.nextInt();

        System.out.printf("%d\n%d\n%d\n%.1f\n%d\n%d", a + b, a - b, a * b, (float) a / b, (int) a / b, a % b);

        reader.close();
    }
}
