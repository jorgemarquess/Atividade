import java.time.LocalDate;
import java.util.*;

public class AtividadeJorge {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        Agenda agenda3 = new Agenda();
        List<Agenda> agendas = Arrays.asList(agenda);

        Telefone telefone = new Telefone("(16) 99641-7934", "Tel Comercial");
        Telefone telefone1 = new Telefone("(16) 98106-4802", "Tel Pessoal");
        List<Telefone> telefones = Arrays.asList(telefone);
        List<Telefone> telefones1 = Arrays.asList(telefone1);


        EContato eContato = new EContato("Jorge Luis Marques",
                telefones,
                LocalDate.of(1998, 8, 18),
                22,
                "joh_xd@hotmail.com",
                "www.twitch.tv/jorzeralol");



        EContato eContato1 = new EContato("Estephany Caroline Anceles Peixoto",
                telefones1,
                LocalDate.of(1996, 2, 10),
                25,
                "estehsouza@hotmail.com",
                "www.twitch.tv/estehsouza");

        ContatoComercial contatoComercial = new ContatoComercial("Beraldinho Xaralopolis", telefones, "Agiota", "Patrão");
        agenda2.inserir(contatoComercial);
        System.out.println(agenda2.buscarGeral("Bera").get().getDados());

        Contato contato = new Contato("Flintos Tchonga da Silva", telefones1, LocalDate.of(1890,11,25), 190);

        agenda.inserir(eContato);
        agenda1.inserir(eContato1);
        agenda3.inserir(contato);
        System.out.println(agenda3.buscarGeral("Tchonga").get().getDados());
//        System.out.println(agenda.buscarNome("Jorge Luis Marques").get().getDados());
        System.out.println(agenda.buscarGeral("e").get().getDados());
        System.out.println(agenda1.buscarNome("Estephany Caroline Anceles Peixoto").get().getDados());


    }
}

