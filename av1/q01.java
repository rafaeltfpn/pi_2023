import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String nString = Integer.toString(n);
        int length = nString.length();

        for (int i = 1; i <= length; i++)
            System.out.println(nString.charAt(length - i));

        s.close();
    }
}
