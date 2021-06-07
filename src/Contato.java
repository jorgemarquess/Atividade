import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

public class Contato extends ContatoBasico {
    private LocalDate dtnasc;
    private int idade;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //formatador privado de data

    public Contato(String nome, List<Telefone> telefones, LocalDate dtnasc, int idade) {
        super(nome, telefones);
        this.dtnasc = dtnasc;
        this.idade = idade;
    }

    public LocalDate getDtnasc() {
        return dtnasc;
    }

    public void setDtnasc(LocalDate dtnasc) {
        this.dtnasc = dtnasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getDados() {
        String dados = super.getDados();
        dados += "Data de nascimento: " + dtnasc + "\n" + "Idade: " + idade + " anos";
        return dados;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "dtnasc=" + formatter.format(dtnasc) +
                ", idade=" + idade +
                '}';
    }
}
