import java.util.*;

public class AtividadeJorge {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        List<Agenda> agendas = Arrays.asList(agenda);
        System.out.println(agendas.toString());

        Telefone telefone = new Telefone();
        Telefone telefone1 = new Telefone();
        Telefone telefone2 = new Telefone();
        List<Telefone> telefones = Arrays.asList(telefone, telefone1, telefone2);
        Calendar calendar = new GregorianCalendar(1998, 7, 18);
        Contato contato = new Contato("Jorgin", telefones, calendar, 22);
        System.out.println(contato.toString());


    }
}
