
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


    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static class Main {
        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.printf("Hello and welcome!");

            for (int i = 1; i <= 5; i++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                System.out.println("i = " + i);
            }
        }
    }
}