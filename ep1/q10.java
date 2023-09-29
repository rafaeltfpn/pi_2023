import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int vp = reader.nextInt();
        int fn = reader.nextInt();
        int fp = reader.nextInt();
        int vn = reader.nextInt();

        float acc = (vp + vn) / (float) (vp + vn + fp + fn);
        float prec = vp / (float) (vp + fp);
        float sens = vp / (float) (vp + fn);

        System.out.printf("%.2f\n%.2f\n%.2f", acc, prec, sens);
        reader.close();
    }
}
