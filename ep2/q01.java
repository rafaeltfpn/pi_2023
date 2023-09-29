import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float nota1 = reader.nextFloat();
        float nota2 = reader.nextFloat();

        float mf = (nota1 + nota2) / 2;

        System.out.printf("%.2f\n", mf);

        if (mf >= 5)
            System.out.println("APROVADO");
        else {
            float notaRec = reader.nextFloat();
            float mediaRec = (mf + notaRec) / 2;
            System.out.printf("%.2f\n", mediaRec);
            if (mediaRec >= 5)
                System.out.println("APROVADO");
            else
                System.out.println("REPROVADO");

        }

        reader.close();
    }
}
