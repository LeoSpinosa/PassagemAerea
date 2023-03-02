package ExercicioPassagemAerea;

import java.util.*;

public class Voo {

    private int numero;
    private int duracao;
    private String data;
    private double precoBase;
    private int milhas;

    private List<Aeronave> aeronaves;
    private Cidade origem;
    private Cidade destino;

    public Voo(int numero, int duracao, String data, double precoBase, int milhas, Cidade origem, Cidade destino) {
        this.numero = numero;
        this.duracao = duracao;
        this.data = data;
        this.precoBase = precoBase;
        this.milhas = milhas;
        this.aeronaves = new ArrayList<>();
        this.origem = origem;
        this.destino = destino;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public int getMilhas() {
        return milhas;
    }

    public void setMilhas(int milhas) {
        this.milhas = milhas;
    }

    public List<Aeronave> getAeronaves() {
        return aeronaves;
    }

    public void setAeronaves(List<Aeronave> aeronaves) {
        this.aeronaves = aeronaves;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "{" + "origem = " + origem + ", destino = " + destino + '}';
    }

}
