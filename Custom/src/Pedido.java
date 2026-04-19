import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private long id;
    private int data;
    private String status;
    private Double valorTotal;

    Pedido(){

    }




    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemPedido item) {

        itens.add(item);
        item.setPedido(this);
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        this.valorTotal = total;
        return total;
    }






    public void setId(long id) {
        this.id = id;

    }

    public long getId() {

        return id;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorTotal(){
        return valorTotal;
    }



}







