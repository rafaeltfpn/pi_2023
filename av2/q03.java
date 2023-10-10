import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(), qntPar = 0, qntImpar = 0, i;

        for (i = 0; i < n; i++) {
            int k = s.nextInt();

            if (k % 2 == 0) qntPar++;
            else qntImpar++;
        }

        System.out.printf("%d\n%d\n", qntPar, qntImpar);

        s.close();
    }
}
