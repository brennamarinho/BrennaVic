
public class Exec {
    public static void main(String[] args)  {
        Cliente c1 = new Cliente();
        c1.setNome("joao");
        System.out.println("o nome do cliente eh: " + c1.getNome());


        Cliente a1 = new Cliente();
        a1.setId(01);
        System.out.println(a1.getId());

        Carrinho d1 = new Carrinho();
        d1.setIdcar(33331);
        System.out.println(d1.getIdcar());

        Carrinho l2 = new Carrinho();
        l2.setValorTotal(23.3);
        System.out.println(l2.getValorTotal());

        Pedido p1 = new Pedido();
        p1.setValorTotal(33.5);
        System.out.println(p1.getValorTotal());

        ItemCarrinho i1 = new ItemCarrinho();
        i1.setPrecoUnitario(33.9);
        System.out.println(i1.getPrecoUnitario());

        Build b1 = new Build();
        b1.setCompativel(true);
        System.out.println(b1.getCompativel());

    }

}