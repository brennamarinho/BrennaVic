//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click theon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Aluno {
    String nome;
    int idade;
    String curso;
    int altura;

    public static int totalAltura = 0;

    public Aluno(int altura) {
        this.altura = altura;
        totalAltura++;
    }


    Aluno(String nome, int idade ) {
        this.nome = nome;
        this.idade = idade;
    }

    Aluno(String nome, int idade, String curso)  {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }











}