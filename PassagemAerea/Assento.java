package ExercicioPassagemAerea;

import java.util.*;

public class Assento {

    private String posicao;

    private List<Categoria> categorias;

    public Assento(String posicao) {
        this.posicao = posicao;
        this.categorias = new ArrayList<>();
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "posicao " + posicao + '}';
    }

}
