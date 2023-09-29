import java.util.Scanner;

public class q06 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float a = reader.nextFloat();

        System.out.printf("%.2f", a * 0.81);

        reader.close();
    }
}
