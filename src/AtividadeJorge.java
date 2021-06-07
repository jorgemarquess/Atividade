import java.time.LocalDate;
import java.util.*;

public class AtividadeJorge {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        List<Agenda> agendas = Arrays.asList(agenda);
        System.out.println(agendas.toString());

        Telefone telefone = new Telefone("32554578", "Comercial");
        Telefone telefone1 = new Telefone("55557777", "Pessoal");
        Telefone telefone2 = new Telefone("87772111", "Pessoal");
        List<Telefone> telefones = Arrays.asList(telefone, telefone1, telefone2);
        LocalDate dtnasc = LocalDate.of(1998, 7, 18);
        ContatoBasico contato = new Contato("Jorgin", telefones, dtnasc, 22);
        ContatoBasico contatoComercial = new ContatoComercial("Luisinho", telefones, "Professor", "Integral");
        System.out.println(contato.toString());

    }
}
