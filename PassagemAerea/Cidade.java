package ExercicioPassagemAerea;

public class Cidade {

    private int GMT;
    private String nome;
    private int codigoAeroporto;
    private String pais;

    public Cidade(int GMT, String nome, int codigoAeroporto, String pais) {
        this.GMT = GMT;
        this.nome = nome;
        this.codigoAeroporto = codigoAeroporto;
        this.pais = pais;
    }

    public int getGMT() {
        return GMT;
    }

    public void setGMT(int GMT) {
        this.GMT = GMT;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoAeroporto() {
        return codigoAeroporto;
    }

    public void setCodigoAeroporto(int codigoAeroporto) {
        this.codigoAeroporto = codigoAeroporto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Cidade" + nome;
    }

}
