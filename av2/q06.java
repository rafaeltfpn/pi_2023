import java.util.Scanner;

public class q06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int arr[] = new int[n];
        int espelhado[] = new int[n];

        for (int i = 0; i < n; i++) {
            int k = s.nextInt();
            arr[i] = k;
            espelhado[n - i - 1] = k;
        }

        boolean ehEspelhado = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] != espelhado[i]) {
                ehEspelhado = false;
                break;
            }
        }

        if(ehEspelhado)
            System.out.println("SIM");
        else
            System.out.println("NAO");
        s.close();
    }
}
