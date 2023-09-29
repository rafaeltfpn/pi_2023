import java.util.Scanner;

public class q04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int anoProducao = reader.nextInt();
        int codigoMotor = reader.nextInt();
        int distanciaPercorrida = reader.nextInt();

        String requerRevisao = "NAO";

        if (anoProducao >= 1901 && anoProducao <= 2000) {
            if (codigoMotor == 100 || codigoMotor == 101)
                requerRevisao = "SIM";
        } else if (anoProducao >= 2001 && anoProducao <= 2020) {
            if (distanciaPercorrida > 5000)
                requerRevisao = "SIM";
        } else if (anoProducao == 2021) {
            if ((codigoMotor == 200 || codigoMotor == 201) && distanciaPercorrida > 200)
                requerRevisao = "SIM";
        }

        System.out.println(requerRevisao);

        reader.close();
    }
}
