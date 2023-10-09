import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int soma = 0;

        while (true) {
            int n = s.nextInt();
            if (n == 0)
                break;
            soma += n;

        }

        System.out.println(soma);

        s.close();
    }
}
