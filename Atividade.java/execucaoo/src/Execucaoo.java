public class Execucaoo {
    public static void main(String[] args) {
         Professor p1 = new Professor();
         p1.setNome("Joao");
        System.out.println("o nome do professor eh: " + p1.getNome());

        p1.setEspecialidade("Programacao");
        System.out.println("sua especialidade eh: " + p1.getEspecialidade());

        Curso c1 = new Curso();
        c1.setNomedocurso("Ciencia da programcao");
        System.out.println("o nome do curso eh:" + c1.getNomedocurso());

        Professor a1 = new Professor("alto");
        Professor a2 = new Professor ("magro");

        System.out.println("quantidade de tipos de professores: " + Professor.totalProduzido);

        Aluno t1 = new Aluno(9);
        Aluno t2 = new Aluno (8);

        System.out.println("quantidade de tipos de altura: " + Aluno.totalAltura);



    }

}