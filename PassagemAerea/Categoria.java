package ExercicioPassagemAerea;

public class Categoria {

    private String nome;
    private double percentualPreco;

    public Categoria(String nome, double percentualPreco) {

        this.nome = nome;
        this.percentualPreco = percentualPreco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualPreco() {
        return percentualPreco;
    }

    public void setPercentualPreco(double percentualPreco) {
        this.percentualPreco = percentualPreco;
    }

}
