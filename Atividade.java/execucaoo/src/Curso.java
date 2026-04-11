//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Curso {
    private String nomedocurso;
    private int CargaHoraria;
    private String professor;

    Curso(){
        String nome = "Ciencia da Computacao";
        int CargaHoraria = 30;
        String Professor = "João";
    }

public String getNomedocurso(){
        return nomedocurso;
}

public void setNomedocurso(String nomedocurso) {
        this.nomedocurso = nomedocurso;
}

public int getCargaHoraria() {
        return CargaHoraria;
}

public void setCargaHoraria(int cargahoraria) {
        this.CargaHoraria = CargaHoraria;
}

public String getProfessor() {
        return professor;
}

public void setProfessor(String professor) {
        this.professor = professor;
}




}