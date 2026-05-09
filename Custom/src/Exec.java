
public class Exec {
    public static void main(String[] args) {
        /*Cliente c1 = new Cliente();
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
*/
        /*
            // 1. Preparamos o terreno
            IRepositorioPedido repo = new RepositorioPedido();
            PedidoService service = new PedidoService(repo);

            // 2. Criamos pedidos para testar
            Pedido p1 = new Pedido(10, "PENDENTE");
            Pedido p2 = new Pedido(20, "ENVIADO");

            repo.salvar(p1);
            repo.salvar(p2);

            System.out.println("\n--- INICIANDO TESTES ---");

            // TESTE 1: Cancelar pedido ENVIADO (Deve dar erro)
            try {
                System.out.println("Tentando cancelar pedido 20 (Enviado)...");
                service.cancelarPedido(20);
            } catch (PedidoNaoEncontradoException | PedidoEnviadoException e) {
                System.out.println("LOG DE ERRO: " + e.getMessage());
            }

            // TESTE 2: Cancelar pedido que NÃO EXISTE (Deve dar erro)
            try {
                System.out.println("\nTentando cancelar pedido 99 (Inexistente)...");
                service.cancelarPedido(99);
            } catch (PedidoNaoEncontradoException | PedidoEnviadoException e) {
                System.out.println("LOG DE ERRO: " + e.getMessage());
            }

            // TESTE 3: Cancelar pedido PENDENTE (Deve funcionar)
            try {
                System.out.println("\nTentando cancelar pedido 10 (Pendente)...");
                service.cancelarPedido(10);
                System.out.println("Verificando lista após cancelamento: " + repo.listarTodos().size() + " pedido(s) restante(s).");
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

         */

        PedidoService service = new PedidoService(new RepositorioPedido());
        Carrinho carrinho = new Carrinho();
        carrinho.setId(10);
        // ... adiciona um item ao carrinho aqui ...

        try {
            System.out.println("\n--- Teste 1: Cancelar Pendente ---");
            Pedido p1 = service.finalizarCompra(carrinho);
            service.cancelarPedido(p1.getId());
        } catch (Exception e) {
            System.out.println("Erro inesperado no Teste 1: " + e.getMessage());
        }

// --- TESTE 2: ENVIADO (O erro esperado!) ---
        try {
            System.out.println("\n--- Teste 2: Cancelar Enviado ---");
            Pedido p2 = service.finalizarCompra(carrinho);
            p2.setStatus("ENVIADO");
            service.cancelarPedido(p2.getId());
        } catch (Exception e) {
            // Aqui é onde o Teste 2 "termina" com sucesso ao mostrar a mensagem de bloqueio
            System.out.println("RESULTADO ESPERADO: " + e.getMessage());
        }

// --- TESTE 3: INEXISTENTE ---
        try {
            System.out.println("\n--- Teste 3: Cancelar Inexistente ---");
            service.cancelarPedido(999);
        } catch (Exception e) {
            System.out.println("RESULTADO ESPERADO: " + e.getMessage());
        }


    }
}