import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        TemperaturaFacade f1 = new TemperaturaFacade();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            System.out.println("Qual foi a " + i + "º temperatura ?");
            Double val = scanner.nextDouble();
            String mes = (i == 1 ? "Janeiro"
                    : (i == 2 ? "Fevereiro"
                            : (i == 3 ? "Março" : (i == 4 ? "Abril" : (i == 5 ? "Maio" : (i == 6 ? "Junho" : ""))))));
            f1.cadastrarTemperatura(val, mes);
        }
        scanner.close();

        f1.temperaturaAcimaMedia();

    }

}
