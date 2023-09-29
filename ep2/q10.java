import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double autonomia = 0;

        int carga = reader.nextInt();
        int aX = reader.nextInt();
        int aY = reader.nextInt();
        int bX = reader.nextInt();
        int bY = reader.nextInt();

        double distancia = Math.sqrt(Math.pow(aX - bX, 2) + Math.pow(aY - bY, 2));
        System.out.printf("%.2f\n", distancia);

        if (carga <= 50000)
            autonomia = 18000;
        else if (carga > 50000 && carga <= 200000)
            autonomia = 9000;
        else
            autonomia = 3000;

        if (autonomia > distancia)
            System.out.println("SIM");
        else if (autonomia * 1.1 > distancia)
            System.out.println("TALVEZ");
        else
            System.out.println("NAO");

        reader.close();
    }
}
