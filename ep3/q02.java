import java.util.Scanner;

public class q02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
        boolean isFib = false;
        while (c <= n) {
            if (c == n) {
                isFib = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }

        if (isFib)
            System.out.println("Verdadeiro");
        else
            System.out.println("Falso");

        reader.close();
    }
}
