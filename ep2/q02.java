import java.util.Scanner;

public class q02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float salarioVendedor = reader.nextFloat();
        float somaVendas = reader.nextFloat();

        float comissao = somaVendas * 0.2f;

        System.out.printf("%.2f\n", comissao);

        if (comissao < salarioVendedor * 0.5f)
            System.out.println("Nao atingiu meta de vendas");
        else
            System.out.println("Atingiu meta de vendas");
        reader.close();
    }
}
