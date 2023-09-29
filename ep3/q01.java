import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        for (int i = 1; i < n*4; i += 4) {
            System.out.printf("%d %d %d PIM\n", i, i + 1, i + 2);
        }

        reader.close();
    }
}
