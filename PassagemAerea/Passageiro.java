package ExercicioPassagemAerea;

import java.util.*;

public class Passageiro {

    private String nome;
    private String sobrenome;
    private boolean vegetariano;

    private CartaoFidelidade cartaoFidelidade;
    private List<Reserva> reservas;

    public Passageiro(String nome, String sobrenome, boolean vegetariano, CartaoFidelidade cartaoFidelidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.vegetariano = vegetariano;
        this.cartaoFidelidade = cartaoFidelidade;
        this.reservas = new ArrayList<>();
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public CartaoFidelidade getCartaoFidelidade() {
        return cartaoFidelidade;
    }

    public void setCartaoFidelidade(CartaoFidelidade cartaoFidelidade) {
        this.cartaoFidelidade = cartaoFidelidade;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome = " + nome + ", sobrenome = " + sobrenome + ", vegetariano = " + vegetariano + ", cartaoFidelidade = " + cartaoFidelidade + ", reservas = " + reservas + '}';
    }

}
