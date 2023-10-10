import java.util.Scanner;

public class q04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(), i;
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int soma = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] == 1) {
                if (i != 0)
                    soma += arr[i - 1];
                if (i != n - 1)
                    soma += arr[i + 1];
            }
        }

        System.out.println(soma);
        s.close();
    }
}
    