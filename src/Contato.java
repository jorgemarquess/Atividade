import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class Contato extends ContatoBasico {
    private Calendar dtnasc;
    private int idade;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //formatador privado de data

    public Contato(String nome, List<Telefone> telefones, Calendar dtnasc, int idade) {
        super(nome, telefones);
        this.dtnasc = dtnasc;
        this.idade = idade;
    }

    public String getDtnasc() {
        return formatter.format(dtnasc.getTime());
    }

    public void setDtnasc(Calendar dtnasc) {
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
        dados += "Data de nascimento: " + dtnasc + "\n" + "Idade: " + idade;
        return dados;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "dtnasc=" + formatter.format(dtnasc.getTime()) +
                ", idade=" + idade +
                '}';
    }
}
