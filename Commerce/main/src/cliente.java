
import java.time.LocalDate;
public class Main {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;

    public void calcularidade() {
        System.out.println("a data de nascimento eh : " + this.dataNascimento);
    }

    public int getCpf () {
        return cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }
    public String getNome () {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setDataNascimento () {
        return dataNascimento;
    }
    public LocalDate getDataNascimento () {
        this.dataNascimento = dataNascimento;
    }





}