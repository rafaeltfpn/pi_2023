import java.util.Scanner;

public class q08 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int capacidadeMinhao = reader.nextInt();

        int caixas500kg = capacidadeMinhao / 500;
        int caixas100kg = capacidadeMinhao % 500 / 100;
        int caixas25kg = capacidadeMinhao % 500 % 100 / 25;
        int caixas1kg = capacidadeMinhao % 500 % 100 % 25;

        System.out.printf("%d\n%d\n%d\n%d", caixas500kg, caixas100kg, caixas25kg, caixas1kg);

        reader.close();
    }
}
