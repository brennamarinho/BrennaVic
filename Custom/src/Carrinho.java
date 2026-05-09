import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private int id;
    private Double valorTotal;



    private List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarItem(ItemCarrinho item) {
        itens.add(item);
        item.setCarrinho(this); // mesma lógica do pedido
    }
/*
    public void removerItem(ItemCarrinho Item) {
        itens.remove(item);
        item.setCarrinho(null);
    }

 */


    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total = total + item.getSubtotal();
        }
        this.valorTotal = total;
        return total;
    }





    public void setId(int id) {
        this.id = id;

    }
    public int getId() {

        return id;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;

    }
    public double getValorTotal() {
        return valorTotal;
    }

    public Carrinho() {

    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }


}
