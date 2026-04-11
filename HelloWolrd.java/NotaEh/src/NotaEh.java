import java.util.Scanner;

public class NotaEh {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("digite sua idade:");
        int idade = teclado.nextInt();
        System.out.println(nome + idade);
    }
}
