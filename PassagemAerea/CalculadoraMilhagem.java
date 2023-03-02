package ExercicioPassagemAerea;

public class CalculadoraMilhagem {

    private Voo voo;

    public long calculaCustoEmMilhas(Voo trecho) {

        long calcular = (long) trecho.getPrecoBase() * 10;
        return calcular;
    }

    public long calculaMilhasGanhas(Voo trecho) {

        long calcular = (long) trecho.getPrecoBase() * 6;
        return calcular;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

}
