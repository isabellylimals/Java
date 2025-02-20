/*Exercício - Enumeração (Estados de Pedido)
Crie um enum chamado StatusPedido com os seguintes estados:

AGUARDANDO_PAGAMENTO
PROCESSANDO
ENVIADO
ENTREGUE
Tarefas:

Crie uma classe Pedido com os atributos:
id (int)
status (StatusPedido)
Implemente um método para mudar o status do pedido para o próximo estado.
No main, crie um pedido e altere seu status até ser ENTREGUE, imprimindo cada mudança. */

package enumm;

public class Estadosdepedidos {
    public static void main(String[] args) {
        
        Pedido pedido = new Pedido(789, StatusPedido.AGUARDANDO_PAGAMENTO);
        
        
        System.out.println("Status inicial do pedido " + pedido.id + ": " + pedido.status);
        
        
        pedido.mudarstatus(StatusPedido.PROCESSANDO);
        System.out.println("Novo status do pedido " + pedido.id + ": " + pedido.status);
        
        
        pedido.mudarstatus(StatusPedido.ENVIADO);
        System.out.println("Novo status do pedido " + pedido.id + ": " + pedido.status);
    }
}

enum StatusPedido {
    AGUARDANDO_PAGAMENTO,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE;
}

class Pedido {
    int id;
    StatusPedido status;

    public Pedido(int id, StatusPedido status) {
        this.id = id;
        this.status = status;
    }

    
    public void mudarstatus(StatusPedido novoStatus) {
        System.out.println("Mudando status do pedido " + this.id + " de " + this.status + " para " + novoStatus);
        this.status = novoStatus; 
    }
}