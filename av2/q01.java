import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        int maior = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (i == 0)
                maior = arr[i];
            else if (arr[i] > maior)
                maior = arr[i];
        }

        System.out.println(maior);

        s.close();
    }
}