import java.time.LocalDate;
import java.util.*;

public class AtividadeJorge {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        List<Agenda> agendas = Arrays.asList(agenda);

        Telefone telefone = new Telefone("8738273832", "Comercial");
        List<Telefone> telefones = Arrays.asList(telefone);
        EContato eContato = new EContato("Jorgin",
                telefones,
                LocalDate.of(1998, 7, 18),
                22,
                "jisjdijdis@hotmail.com",
                "www.fdfsfsd.com");

        agenda.inserir(eContato);
        System.out.println(agenda.buscarNome("Jorgin").get().getDados());
    }
}
