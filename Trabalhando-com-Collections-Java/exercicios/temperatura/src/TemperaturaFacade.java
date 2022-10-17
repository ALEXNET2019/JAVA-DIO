import java.util.ArrayList;

public class TemperaturaFacade {
    private ArrayList<Temperatura> temperaturas;

    public TemperaturaFacade() {
        this.temperaturas = new ArrayList();
    }

    public void cadastrarTemperatura(Double temperatura, String mes) {
        Temperatura temp = new Temperatura();
        temp.setTemperatura(temperatura);
        temp.setMes(mes);

        temperaturas.add(temp);
    }

    public String temperaturaAcimaMedia() {
        Double soma = 0d;
        ;
        Double media = 0d;
        for (Temperatura t : temperaturas) {
            soma = soma + t.getTemperatura();
        }
        media = soma / temperaturas.size();

        for (Temperatura t : temperaturas) {
            if (t.getTemperatura() > media) {
                System.out
                        .println("O mês de " + t.getMes() + " teve temperura de " + t.getTemperatura()
                                + " Graus celsius");

            }
        }
        System.out.println("Tiveram temperatura acima da média !");
        return null;
    }

}
