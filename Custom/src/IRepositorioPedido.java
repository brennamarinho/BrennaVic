import java.util.List;

public interface IRepositorioPedido {

    void salvar(Pedido pedido);
    void deletar(int id) throws PedidoNaoEncontradoException;
    Pedido buscarPorId(int id) throws PedidoNaoEncontradoException;
    List<Pedido> listarTodos();

}
