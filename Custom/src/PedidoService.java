public class PedidoService {
    private IRepositorioPedido repositorio;

    public PedidoService(IRepositorioPedido repositorio) {
        this.repositorio = repositorio;
    }


    public void cancelarPedido(int id) throws PedidoNaoEncontradoException, PedidoEnviadoException {
        Pedido p = repositorio.buscarPorId(id);

        if (p == null) {
            throw new PedidoNaoEncontradoException("ID " + id + " não encontrado.");
        }
        if ("ENVIADO".equalsIgnoreCase(p.getStatus())) {
            throw new PedidoEnviadoException();
        }

        repositorio.deletar(id);
        System.out.println("Pedido *" + id+ "foi cancelado");
    }

    public Pedido finalizarCompra(Carrinho carrinho) throws CarrinhoVazioException {

        if (carrinho.getItens() == null || carrinho.getItens().isEmpty()) {
            throw new CarrinhoVazioException();
        }

        Pedido novoPedido = new Pedido(carrinho.getId(), "PENDENTE");


        for (ItemCarrinho itemC : carrinho.getItens()) {
            ItemPedido itemP = new ItemPedido();

            itemP.setQuantidade(itemC.getQuantidade());
            itemP.setPrecoUnitario(itemC.getPrecoUnitario());

            novoPedido.adicionarItem(itemP);
        }

        novoPedido.calcularTotal();
        repositorio.salvar(novoPedido);

        System.out.println("O carrinho * " + carrinho.getId() +
                " foi convertido no pedido *" + novoPedido.getId());

        return novoPedido;
    }


    }






