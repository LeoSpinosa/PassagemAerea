package ExercicioPassagemAerea;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Cartao Fidelidade
        CartaoFidelidade ganhoMilhas = new CartaoFidelidade("10", 100, CategoriaCartao.GOLD);

        //Cidade - Origem
        Cidade floripa = new Cidade(2, "Floripa", 22, "Brasil");

        //Cidade - Destino
        Cidade rioDeJaneiro = new Cidade(4, "Rio de Janeiro", 13, "Brasil");

        //Voo
        Voo vooTeste = new Voo(5, 30, "17-11-2022", 150.00, 10000, floripa, rioDeJaneiro);

        //Passageiro
        Passageiro leo = new Passageiro("Leonardo", "Spinosa", false, ganhoMilhas);

        //Forma de pagamento
        FormaPagamento cartaoDeCredito = new PagamentoCartaoCredito();
        FormaPagamento desconto = new PagamentoDescontoCarteira();
        FormaPagamento pagMilhas = new PagamentoMilhagem();

        //Reserva
        Reserva reservaEmLista = new Reserva(2, 20, 22, StatusReserva.EM_LISTA, leo, vooTeste, cartaoDeCredito);

        //Reserva Confirmada
        Reserva reservaConfirmada = new Reserva(2, 20, 22, StatusReserva.CONFIRMADA, leo, vooTeste, cartaoDeCredito);

        //Assento
        Assento numAssento = new Assento("L10");

        //Categoria
        Categoria primeiraClasse = new Categoria("Primeira Classe", 5);

        List<Categoria> class1 = new ArrayList<>();

        class1.add(primeiraClasse);

        numAssento.setCategorias(class1);

        //Bilhete
        Bilhete bilheteTeste = new Bilhete(reservaConfirmada, numAssento);

        //Aeronave
        Aeronave latan = new Aeronave(50, "aviao", 1324, "Chevrolet");

        //Execução
        System.out.println("Bem vindo passageiro " + leo.getNome());
        System.out.println("Seu bilhete pertence a " + bilheteTeste.toString());

    }
}
