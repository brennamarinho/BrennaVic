
public class Professor {
    private String nome;
    private String especialidade;
    public String tipo;

    public static int  totalProduzido = 0;

    public Professor(String tipo) {
        this.tipo = tipo;
        totalProduzido++;
    }


    Professor() {
        String nome = "Joao";
        String especialidade  = "programação";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade () {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}

