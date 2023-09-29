import java.util.Scanner;

public class q06 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int dia1 = reader.nextInt();
        int mes1 = reader.nextInt();
        int ano1 = reader.nextInt();

        int dia2 = reader.nextInt();
        int mes2 = reader.nextInt();
        int ano2 = reader.nextInt();

        if (ano1 < ano2)
            System.out.println("DATA1");
        else if (ano1 > ano2)
            System.out.println("DATA2");
        else {
            if (mes1 < mes2)
                System.out.println("DATA1");
            else if (mes1 > mes2)
                System.out.println("DATA2");
            else {
                if (dia1 < dia2)
                    System.out.println("DATA1");
                else if (dia1 > dia2)
                    System.out.println("DATA2");
                else
                    System.out.println("IGUAIS");
            }
        }

        reader.close();
    }
}
