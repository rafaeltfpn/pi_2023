import java.util.Scanner;

public class q04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int multiplosCinco = 0, multiplosTres = 0;

        while (true) {
            int n = s.nextInt();
            if (n == 0)
                break;
            if (n % 3 == 0)
                multiplosTres++;
            if (n % 5 == 0)
                multiplosCinco++;
        }

        System.out.println(multiplosTres);
        System.out.println(multiplosCinco);

        s.close();
    }
}
