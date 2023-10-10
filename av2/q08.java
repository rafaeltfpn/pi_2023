import java.util.Scanner;

public class q08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(), i;
        boolean ehMult = true;

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (i = 0; i < n; i++)
            arrA[i] = s.nextInt();
        for (i = 0; i < n; i++)
            arrB[i] = s.nextInt();

        int fatorComum = arrB[0] / arrA[0];

        for (i = 0; i < n; i++) {
            if (arrB[i] / arrA[i] != fatorComum) {
                ehMult = false;
                break;
            }
        }

        if (ehMult)
            System.out.println("SIM");
        else
            System.out.println("NAO");

            
        s.close();
    }
}
