import java.util.Scanner;

public class q05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(), qnt = 0, i = 2;
        while (qnt < n) {
            boolean ehPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++)
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            if (ehPrimo) {
                System.out.println(i);
                qnt++;
            }
            i++;
        }
        s.close();
    }
}
