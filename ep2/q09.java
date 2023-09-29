import java.util.Scanner;

public class q09 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int codigo = reader.nextInt();

        int origem = codigo / 10000;
        int destino = (codigo % 10000) / 100;
        int modelo = codigo % 100;

        String origemStr = "";
        String destinoStr = "";
        String modeloStr = "";

        if (origem == 80)
            origemStr = "Marte";
        else if (origem == 81)
            origemStr = "Saturno";
        else if (origem == 90)
            origemStr = "Netuno";
        else if (origem == 91)
            origemStr = "HD21749b";

        if (destino == 80)
            destinoStr = "Marte";
        else if (destino == 81)
            destinoStr = "Saturno";
        else if (destino == 90)
            destinoStr = "Netuno";
        else if (destino == 91)
            destinoStr = "HD21749b";

        if (modelo == 60)
            modeloStr = "A6000";
        else if (modelo == 61)
            modeloStr = "B7500";
        else if (modelo == 62)
            modeloStr = "C9000";

        System.out.printf("%s\n%s\n%s", origemStr, destinoStr, modeloStr);

        reader.close();
    }
}
