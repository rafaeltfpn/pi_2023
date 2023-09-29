import java.util.Scanner;
import java.lang.Math;

public class q04 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        double aX = reader.nextDouble();
        double aY = reader.nextDouble();
        double bX = reader.nextDouble();
        double bY = reader.nextDouble();

        double dAB = Math.sqrt(Math.pow(bX - aX, 2) + Math.pow(bY - aY, 2));

        System.out.printf("%.2f", dAB);

        reader.close();
    }
}
