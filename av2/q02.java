import java.util.Scanner;

public class q02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arrNotas = new int[n];
        String[] arrNomes = new String[n];
        int soma = 0;
        for (int i = 0; i < n; i++) {
            arrNomes[i] = s.next();
            arrNotas[i] = s.nextInt();
            soma += arrNotas[i];
        }

        float media = (float) soma / n;

        for (int i = 0; i < n; i++) {
            if (arrNotas[i] > media)
                System.out.println(arrNomes[i]);
        }
        s.close();
    }
}
