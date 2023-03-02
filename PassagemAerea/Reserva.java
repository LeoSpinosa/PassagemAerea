package ExercicioPassagemAerea;

public class Reserva {

    private int codigo;
    private int data;
    private int dataLimite;

    private StatusReserva status;
    private Passageiro passageiro;
    private Voo voo;
    private FormaPagamento formaPagamento;

    public Reserva(int codigo, int data, int dataLimite, StatusReserva status, Passageiro passageiro, Voo voo, FormaPagamento formaPagamento) {
        this.codigo = codigo;
        this.data = data;
        this.dataLimite = dataLimite;
        this.status = status;
        this.passageiro = passageiro;
        this.voo = voo;
        this.formaPagamento = formaPagamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(int dataLimite) {
        this.dataLimite = dataLimite;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Reserva{" + "codigo = " + codigo + ", data = " + data + ", dataLimite = " + dataLimite + ", status = " + status + ", voo = " + voo + '}';
    }

}
