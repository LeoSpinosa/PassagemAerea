package ExercicioPassagemAerea;

import java.util.*;

public class Aeronave {

    private int capacidade;
    private String modelo;
    private long codigoFAB;
    private String fabricante;

    private List<Assento> assentos;

    public Aeronave(int capacidade, String modelo, long codigoFAB, String fabricante) {
        this.capacidade = capacidade;
        this.modelo = modelo;
        this.codigoFAB = codigoFAB;
        this.fabricante = fabricante;
        this.assentos = new ArrayList();
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getCodigoFAB() {
        return codigoFAB;
    }

    public void setCodigoFAB(long codigoFAB) {
        this.codigoFAB = codigoFAB;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        this.assentos = assentos;
    }
}
