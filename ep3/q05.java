import java.util.Scanner;

public class q05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        int v = reader.nextInt();

        String string_n = Integer.toString(n);

        for (int i = 0; i < string_n.length(); i++) {
            for (int j = 0; j < v; j++)
            System.out.print(string_n.charAt(i) + " ");

            System.out.println();
        }

        reader.close();
    }
}
