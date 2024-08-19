import modelo.ContaAReceber;
import modelo.Pagamento;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        //criando objeto

        ContaAReceber cr= new ContaAReceber(1000,"Paulo Roberto Nascimento morreira ");
        System.out.println(cr);

        System.out.println(cr.getFonte());

        try { Pagamento p1 = new Pagamento(200,LocalDate.now());
            cr.addPagamento(p1);

            Pagamento p2 = new Pagamento(500,LocalDate.now());
            cr.addPagamento(p2);

            cr.addPagamento(new Pagamento(500,LocalDate.now()));

            System.out.println(cr);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

       ;



    }
}