import java.util.Scanner;

public class q02 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        float nota1 = reader.nextFloat();
        float nota2 = reader.nextFloat();
        float nota3 = reader.nextFloat();

        float med = (nota1 + nota2 + nota3) / 3;

        System.out.printf("%.2f", med);

        reader.close();
    }
}
