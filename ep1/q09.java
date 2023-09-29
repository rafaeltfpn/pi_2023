import java.util.Scanner;
import java.lang.Math;

public class q09 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int tamanhoArquivo = reader.nextInt();

        long tamanhoGB = tamanhoArquivo * (long) Math.pow(10, 9);
        long tamanhoGiB = tamanhoArquivo * (long) Math.pow(2, 30);

        System.out.printf("%d\n%d\n%d", tamanhoGB, tamanhoGiB, tamanhoGiB - tamanhoGB);
        reader.close();
    }
}
