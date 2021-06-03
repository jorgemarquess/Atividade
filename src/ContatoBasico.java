import java.util.List;

abstract public class ContatoBasico {
    private String nome;
    private List<Telefone> telefones;

    public ContatoBasico(String nome, List<Telefone> telefones) {
        this.nome = nome;
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public String getDados() {
        String dados = nome + "\n";
        for (Telefone telefone : telefones) {
            dados += telefone.getTelefone() + "\n";
        }
        return dados;
    }
}
