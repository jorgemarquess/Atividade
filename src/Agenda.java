import java.util.*;

public class Agenda {
    private String nome;
    private String email;
    private String palavraChave;
    private int pos;
    private List<ContatoBasico> contatoBasicoLista = new ArrayList<>();
    private List<EContato> eContatoLista = new ArrayList<>();
    private List<ContatoComercial> contatoComercialLista = new ArrayList<>();


    public Agenda(String nome, String email, String palavraChave, int pos, List<EContato> eContatoLista, List<ContatoComercial> contatoComercialLista, List<ContatoBasico> contatoBasicoLista) {
        this.nome = nome;
        this.email = email;
        this.palavraChave = palavraChave;
        this.pos = pos;
        this.contatoBasicoLista = contatoBasicoLista;
        this.contatoComercialLista = contatoComercialLista;
        this.eContatoLista = eContatoLista;
    }

    public Agenda() {

    }

    public Optional<ContatoBasico> buscarNome(String nome) {
        for (ContatoBasico contatoBasico : contatoBasicoLista) {
            if (contatoBasico.getNome().equals(nome)) {
                return Optional.of(contatoBasico);
            }
        }
        return null;
    }

    public Optional<ContatoBasico> buscarPosicao(int pos) {
        return Optional.of(contatoBasicoLista.get(pos));

    }

    public Optional<EContato> buscarEmail(String email) { //Validar se o email está sendo único
        for (ContatoBasico contatoBasico : contatoBasicoLista) {
            if (((EContato) contatoBasico).getEmail().equals(email)) {
                return Optional.of((EContato) contatoBasico);
            }
        }

        return null;
    }

    public Optional<ContatoBasico> buscarGeral(String palavraChave) {
        for (ContatoBasico contatoBasico : contatoBasicoLista) {
            if (contatoBasico.getNome().contains(palavraChave) || ((EContato) contatoBasico).getEmail().contains(palavraChave)) {
                return Optional.of(contatoBasico);
            }
        }

        return null;
    }

    public List<ContatoBasico> buscarTodos() {
        return contatoBasicoLista;

    }

    public int obterQuantidade() {
        return contatoBasicoLista.size();

    }

    public void inserir(ContatoBasico contatoBasico) {
        this.contatoBasicoLista.add(contatoBasico);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", palavraChave='" + palavraChave + '\'' +
                ", pos=" + pos +
                '}';
    }
}