import java.util.Calendar;
import java.util.List;

public class EContato extends Contato {
    private String email;
    private String homepage;

    public EContato(String nome, List<Telefone> telefones, Calendar dtnasc, int idade, String email, String homepage, String hp) {
        super(nome, telefones, dtnasc, idade);
        this.email = email;
        this.homepage = homepage;
    }

    public String getEmail() {
        return email;
    }

    public String getHomepage() {
        return homepage;
    }

    @Override
    public String getDados() {
        String dados = super.getDados();
        dados += "E-mail: " + email + "Home page: " + homepage;
        return dados;
    }

}
