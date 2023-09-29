import java.util.Scanner;

public class q05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int qntUns = 0;

        for (int i = 0; i < 7; i++) {
            int bit = reader.nextInt();
            if (bit == 1)
                qntUns++;
        }

        if (qntUns % 2 == 0)
            System.out.println(0);
        else
            System.out.println(1);

        reader.close();
    }
}
