
public class Carro {
    public String cor = "Amarelo";
    public String marca;
    boolean airbag;
    private String nome;
    private int tempo;
    float km;
    private boolean fumee; //esse aqui so pode ser alterado/exibido se estiver dentro da classe. caso nao, permanece privado


    public String toString() {
        return marca;
    }

    public int getTempo () {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void status() {
        System.out.println("o carro tem cor " + this.cor);
        System.out.println(airbag);
        System.out.println(km);
        System.out.println(fumee);
        System.out.println(cor);
        System.out.println(marca);


    }
    void com()
    {
        this.airbag = true;
    }
    void sem()
    {
        this.airbag = false;
    }
    void seguranca() {
        if (this.airbag == true) {
            System.out.println("seguro");
        } else {
                System.out.println("nao esta seguro");
            }
    }
    void vidrofume() {
        this.fumee = true;
    }
    void semvidro() {
        this.fumee = false;
    }
    public void escuro()
    //apesar de "fumee" ser acesso private, como ele está dentro de uma classe publica, pode ser manipulado,mas quando ta sozinho nao consegue
    {
        if(this.fumee == true) {
            System.out.println("escuro");
        } else {
            System.out.println("nao escuro");
        }
    }
    public String getMarca() {
        return marca;
    }
}