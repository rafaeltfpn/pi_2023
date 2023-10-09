import java.util.Scanner;

public class q07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(), soma = 0, i, min = 0, maximo = 0;

        for (i = 0; i < n; i++) {
            int k = s.nextInt();
            soma += k;
            if (i == 0) {
                min = k;
                maximo = k;
            } else {
                if (k < min)
                    min = k;
                if (k > maximo)
                    maximo = k;
            }
        }

        System.out.println(soma);
        System.out.printf("%.2f\n", (float) soma / n);
        System.out.println(min);
        System.out.println(maximo);

        s.close();
    }
}
