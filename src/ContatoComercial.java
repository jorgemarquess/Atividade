import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ContatoComercial extends ContatoBasico {
    private String atividade;
    private String funcionario;

    public ContatoComercial(String nome, List<Telefone> telefones, String ativade, String funcionario) {
        super(nome, telefones);
        this.atividade = ativade;
        this.funcionario = funcionario;
    }

    public String getAtivade() {
        return atividade;
    }

    public void setAtivade(String ativade) {
        this.atividade = ativade;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String getDados(){
        String dados = super.getDados();
        dados += "Profissão: " + atividade + "\n" + "Funcionario: " + funcionario;
        return dados;
    }
}
