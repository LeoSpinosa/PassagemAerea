package ExercicioPassagemAerea;

public class Bilhete {

    private Passageiro passageiro;
    private Reserva reserva;
    private Assento assento;
    private Voo voo;

    public Bilhete(Reserva reserva, Assento assento) {

        this.reserva = reserva;
        this.assento = assento;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return reserva + ", assento = " + assento + '}';
    }

}
