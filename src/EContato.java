import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EContato extends Contato {
    private String email;
    private String homepage;

    public EContato(String nome, List<Telefone> telefones, LocalDate dtnasc, int idade, String email, String homepage) {
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
        dados += "\n" + "E-mail: " + email + "\n" + "Home page: " + homepage;
        return dados;
    }

}
