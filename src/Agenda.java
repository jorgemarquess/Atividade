import java.util.*;

public class Agenda {
    private String nome;
    private String email;
    private String palavraChave;
    private int pos;
    private List<ContatoBasico> contatoBasicoLista = Arrays.asList();


    public Agenda(String nome, String email, String palavraChave, int pos, List<ContatoBasico> contatoBasicoLista) {
        this.nome = nome;
        this.email = email;
        this.palavraChave = palavraChave;
        this.pos = pos;
        this.contatoBasicoLista = contatoBasicoLista;
    }

    public Agenda() {

    }

    public String buscarNome(String nome) {
        for (ContatoBasico contatoBasico : contatoBasicoLista) {
            if (contatoBasico.getNome().equals(nome)) {
                return contatoBasico.getDados();
            }
        }
        return "Nome não encontrado";
    }

    public Optional<ContatoBasico> buscarPosicao(int pos) {
        return Optional.of(contatoBasicoLista.get(pos));

    }

    public Contato buscarEmail(String email) { //Validar se o email está sendo único
        for (ContatoBasico contatoBasico : contatoBasicoLista) {
                if (((EContato) contatoBasico).getEmail().equals(email)) {
                    return contatoBasico.getDados();
                }
        }

        return "Não encontrado";
    }

    public void buscarGeral(String palavraChave) {

    }

    public void buscarTodos() {


    }

    public int obterQuantidade() {
        return contatoBasicoLista.size();

    }

    public void inserir(Contato contato) {
        this.contatoBasicoLista.add(contato);

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