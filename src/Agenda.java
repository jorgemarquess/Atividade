import java.util.Arrays;
import java.util.List;

public class Agenda {
    private String nome;
    private String email;
    private String palavraChave;
    private int pos;
    private List<Contato> contato = Arrays.asList();


    public Agenda(String nome, String email, String palavraChave, int pos, List<Agenda> agenda) {
        this.nome = nome;
        this.email = email;
        this.palavraChave = palavraChave;
        this.pos = pos;
        this.contato = contato;
    }

    public Agenda() {

    }

    public void buscarNome(String nome) {



    }

    public void buscarPosicao(int pos) {

    }

    public void buscarEmail(String email) {

    }

    public void buscarGeral(String palavraChave) {

    }

    public void buscarTodos() {


    }

    public void obterQuantidade() {

    }

    public void inserir(Contato contato) {
        this.contato.add(contato);

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