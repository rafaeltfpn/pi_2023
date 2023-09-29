import java.util.Scanner;

public class q07 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();

        if(a >= b && a >= c && b >= c)
            System.out.printf("%d\n%d\n%d", c, b, a);
        else if(a >= b && a >= c && c >= b)
            System.out.printf("%d\n%d\n%d", b, c, a);
        else if(b >= a && b >= c && a >= c)
            System.out.printf("%d\n%d\n%d", c, a, b);
        else if(b >= a && b >= c && c >= a)
            System.out.printf("%d\n%d\n%d", a, c, b);
        else if(c >= a && c >= b && a >= b)
            System.out.printf("%d\n%d\n%d", b, a, c);
        else if(c >= a && c >= b && b >= a)
            System.out.printf("%d\n%d\n%d", a, b, c);

        reader.close();
    }
}
