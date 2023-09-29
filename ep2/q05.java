import java.util.Scanner;

public class q05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int lado1 = reader.nextInt();
        int lado2 = reader.nextInt();
        int lado3 = reader.nextInt();

        // verificar se é triangulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)
            System.out.println("VALIDO");
        else
            System.out.println("INVALIDO");

        reader.close();
    }
}
