package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private List<Veiculo> veiculos = new ArrayList<>();

    public void registrarEntrada(String placa, String nomeModelo, String marca) {
        Modelo modelo = ModeloFactory.getModelo(nomeModelo, marca);
        Veiculo veiculo = new Veiculo(placa, modelo);
        veiculos.add(veiculo);
    }

    public List<String> obterVeiculos() {
        List<String> saida = new ArrayList<String>();
        for (Veiculo veiculo : this.veiculos) {
            saida.add(veiculo.obterVeiculo());
        }
        return saida;
    }
}