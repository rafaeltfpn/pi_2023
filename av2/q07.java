import java.util.Scanner;

public class q07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), i;
        int[] arr = new int[n];
        boolean ordenado = true;
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (i = 0; i < n; i++) {
            if (i == n - 1)
                break; // evita o erro de index out of bounds (i+1)
            if (arr[i] > arr[i + 1]) {
                ordenado = false;
                break;
            }
        }

        if (ordenado)
            System.out.println("SIM");
        else
            System.out.println("NAO");

        s.close();
    }
}
