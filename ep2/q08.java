import java.util.Scanner;

public class q08 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int x = reader.nextInt();
        int y = reader.nextInt();

        if (x >= -800 && x <= 22 && y >= -20 && y <= 35)
            System.out.println("SIM");
        else
            System.out.println("NAO");

        reader.close();
    }
}
