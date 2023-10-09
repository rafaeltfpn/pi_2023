import java.util.Scanner;

public class q08 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int qntEstoque = reader.nextInt(), n = reader.nextInt(), qndVendas = 0, i;

        for (i = 0; i < n; i++) {
            int qntVendida = reader.nextInt();
            if (qntVendida <= qntEstoque) {
                qntEstoque -= qntVendida;
                qndVendas++;
            }
        }

        System.out.println(qndVendas);

        reader.close();
    }
}
