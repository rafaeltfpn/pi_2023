import java.util.Scanner;

public class q05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Escreva um programa que leia um vetor de inteiros com n elementos. Depois
        // ordene todos os elementos em ordem crescente. Importante: não utilize funções
        // prontas da linguagem para ordenação! Escreva o seu algoritmo de ordenação.

        int n = s.nextInt(), i, j;
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (i = 0; i < n; i++) {
            int menor = arr[i], posMenor = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < menor) {
                    menor = arr[j];
                    posMenor = j;
                }
            }
            int aux = arr[i];
            arr[i] = arr[posMenor];
            arr[posMenor] = aux;
        }

        s.close();

        for (i = 0; i < n; i++) {
            System.out.printf("%d\n", arr[i]);
        }
    }
}
