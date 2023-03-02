package ExercicioPassagemAerea;

public class CartaoFidelidade {

    private String numero;
    private long milhasAcumuladas;

    private CategoriaCartao categoria;

    public CartaoFidelidade(String numero, long milhasAcumuladas, CategoriaCartao categoria) {
        this.numero = numero;
        this.milhasAcumuladas = milhasAcumuladas;
        this.categoria = categoria;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public long getMilhasAcumuladas() {
        return milhasAcumuladas;
    }

    public void setMilhasAcumuladas(long milhasAcumuladas) {
        this.milhasAcumuladas = milhasAcumuladas;
    }

    public CategoriaCartao getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCartao categoria) {
        this.categoria = categoria;
    }

}
