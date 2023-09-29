import java.util.Scanner;;

public class subtracao {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();
        int b = reader.nextInt();

        System.out.printf("Sub: %d", a - b);

        reader.close();
    }
}