
public class Execao {
    public static void main(String[] args) {
        Carro k1 = new Carro();
        k1.marca = "Ford";  // k1 eh objeto
        System.out.println(k1);
        k1.km = 100.000f;
        k1.status();
        k1.sem();
        k1.seguranca();
        k1.vidrofume(); ///o metodo vidrofume está sendo executado sobre o objeto (k1)
        k1.escuro();
        k1.setNome("Vic");
        System.out.println(k1.getNome());
        k1.setTempo(8);
        System.out.println(k1.getTempo());



        Carro k2 = new Carro();
        k2.cor = "Azul";
        k2.marca = "renegade";
        k2.status();
        k2.com();
        k2.seguranca();
        k2.vidrofume();
        k2.escuro();
    }

}

