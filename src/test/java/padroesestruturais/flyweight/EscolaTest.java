package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EstacionamentoTest {

    @Test
    void deveRetornarVeiculos() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.registrarEntrada("ABC1D23", "Onix", "Chevrolet");
        estacionamento.registrarEntrada("XYZ9K87", "Onix", "Chevrolet");
        estacionamento.registrarEntrada("JKL4M56", "Onix", "Chevrolet");
        estacionamento.registrarEntrada("QWE7R89", "HB20", "Hyundai");

        List<String> saida = Arrays.asList(
                "Veiculo{placa='ABC1D23', modelo='Onix', marca='Chevrolet'}",
                "Veiculo{placa='XYZ9K87', modelo='Onix', marca='Chevrolet'}",
                "Veiculo{placa='JKL4M56', modelo='Onix', marca='Chevrolet'}",
                "Veiculo{placa='QWE7R89', modelo='HB20', marca='Hyundai'}");

        assertEquals(saida, estacionamento.obterVeiculos());
    }

    @Test
    void deveRetornarTotalModelos() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.registrarEntrada("ABC1D23", "Onix", "Chevrolet");
        estacionamento.registrarEntrada("XYZ9K87", "Onix", "Chevrolet");
        estacionamento.registrarEntrada("JKL4M56", "Onix", "Chevrolet");
        estacionamento.registrarEntrada("QWE7R89", "HB20", "Hyundai");

        assertEquals(2, ModeloFactory.getTotalModelos());
    }

}